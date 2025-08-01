/* Copyright (c) 2024 Airbyte, Inc., all rights reserved. */
package io.airbyte.integrations.source.mysql

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.node.ObjectNode
import com.mysql.cj.MysqlType
import io.airbyte.cdk.command.OpaqueStateValue
import io.airbyte.cdk.discover.CdcIntegerMetaFieldType
import io.airbyte.cdk.discover.CdcOffsetDateTimeMetaFieldType
import io.airbyte.cdk.discover.CdcStringMetaFieldType
import io.airbyte.cdk.discover.CommonMetaField
import io.airbyte.cdk.discover.Field
import io.airbyte.cdk.discover.FieldType
import io.airbyte.cdk.discover.JdbcAirbyteStreamFactory
import io.airbyte.cdk.discover.JdbcMetadataQuerier
import io.airbyte.cdk.discover.MetaField
import io.airbyte.cdk.discover.SystemType
import io.airbyte.cdk.jdbc.BigDecimalFieldType
import io.airbyte.cdk.jdbc.BigIntegerFieldType
import io.airbyte.cdk.jdbc.BinaryStreamFieldType
import io.airbyte.cdk.jdbc.BooleanFieldType
import io.airbyte.cdk.jdbc.BytesFieldType
import io.airbyte.cdk.jdbc.DoubleFieldType
import io.airbyte.cdk.jdbc.FloatFieldType
import io.airbyte.cdk.jdbc.IntFieldType
import io.airbyte.cdk.jdbc.JdbcFieldType
import io.airbyte.cdk.jdbc.LocalDateFieldType
import io.airbyte.cdk.jdbc.LocalDateTimeFieldType
import io.airbyte.cdk.jdbc.LocalTimeFieldType
import io.airbyte.cdk.jdbc.LongFieldType
import io.airbyte.cdk.jdbc.LosslessJdbcFieldType
import io.airbyte.cdk.jdbc.NullFieldType
import io.airbyte.cdk.jdbc.OffsetDateTimeFieldType
import io.airbyte.cdk.jdbc.PokemonFieldType
import io.airbyte.cdk.jdbc.ShortFieldType
import io.airbyte.cdk.jdbc.StringFieldType
import io.airbyte.cdk.output.sockets.FieldValueEncoder
import io.airbyte.cdk.output.sockets.NativeRecordPayload
import io.airbyte.cdk.read.And
import io.airbyte.cdk.read.Equal
import io.airbyte.cdk.read.From
import io.airbyte.cdk.read.FromNode
import io.airbyte.cdk.read.FromSample
import io.airbyte.cdk.read.Greater
import io.airbyte.cdk.read.GreaterOrEqual
import io.airbyte.cdk.read.Lesser
import io.airbyte.cdk.read.LesserOrEqual
import io.airbyte.cdk.read.Limit
import io.airbyte.cdk.read.LimitNode
import io.airbyte.cdk.read.NoFrom
import io.airbyte.cdk.read.NoLimit
import io.airbyte.cdk.read.NoOrderBy
import io.airbyte.cdk.read.NoWhere
import io.airbyte.cdk.read.Or
import io.airbyte.cdk.read.OrderBy
import io.airbyte.cdk.read.OrderByNode
import io.airbyte.cdk.read.SelectColumnMaxValue
import io.airbyte.cdk.read.SelectColumns
import io.airbyte.cdk.read.SelectNode
import io.airbyte.cdk.read.SelectQuery
import io.airbyte.cdk.read.SelectQueryGenerator
import io.airbyte.cdk.read.SelectQuerySpec
import io.airbyte.cdk.read.Stream
import io.airbyte.cdk.read.Where
import io.airbyte.cdk.read.WhereClauseLeafNode
import io.airbyte.cdk.read.WhereClauseNode
import io.airbyte.cdk.read.WhereNode
import io.airbyte.cdk.read.cdc.DebeziumOffset
import io.airbyte.cdk.util.Jsons
import io.micronaut.context.annotation.Primary
import jakarta.inject.Singleton
import java.time.OffsetDateTime

@Singleton
@Primary
class MySqlSourceOperations :
    JdbcMetadataQuerier.FieldTypeMapper, SelectQueryGenerator, JdbcAirbyteStreamFactory {

    override val globalCursor: MetaField = MySqlSourceCdcMetaFields.CDC_CURSOR

    override val globalMetaFields: Set<MetaField> =
        setOf(
            MySqlSourceCdcMetaFields.CDC_CURSOR,
            CommonMetaField.CDC_UPDATED_AT,
            CommonMetaField.CDC_DELETED_AT,
            MySqlSourceCdcMetaFields.CDC_LOG_FILE,
            MySqlSourceCdcMetaFields.CDC_LOG_POS
        )

    override fun decorateRecordData(
        timestamp: OffsetDateTime,
        globalStateValue: OpaqueStateValue?,
        stream: Stream,
        recordData: NativeRecordPayload
    ) {
        recordData.set(
            CommonMetaField.CDC_UPDATED_AT.id,
            FieldValueEncoder(timestamp, CdcOffsetDateTimeMetaFieldType.jsonEncoder)
        )
        recordData.set(
            MySqlSourceCdcMetaFields.CDC_LOG_POS.id,
            FieldValueEncoder(0, CdcIntegerMetaFieldType.jsonEncoder)
        )
        if (globalStateValue == null) {
            return
        }
        val offset: DebeziumOffset =
            MySqlSourceDebeziumOperations.deserializeStateUnvalidated(globalStateValue).offset
        val position: MySqlSourceCdcPosition = MySqlSourceDebeziumOperations.position(offset)
        recordData.set(
            MySqlSourceCdcMetaFields.CDC_LOG_FILE.id,
            FieldValueEncoder(position.fileName, CdcStringMetaFieldType.jsonEncoder)
        )
        recordData.set(
            MySqlSourceCdcMetaFields.CDC_LOG_POS.id,
            FieldValueEncoder(position.position, CdcIntegerMetaFieldType.jsonEncoder)
        )
    }

    override fun decorateRecordData(
        timestamp: OffsetDateTime,
        globalStateValue: OpaqueStateValue?,
        stream: Stream,
        recordData: ObjectNode
    ) {
        recordData.set<JsonNode>(
            CommonMetaField.CDC_UPDATED_AT.id,
            CdcOffsetDateTimeMetaFieldType.jsonEncoder.encode(timestamp),
        )
        recordData.set<JsonNode>(
            MySqlSourceCdcMetaFields.CDC_LOG_POS.id,
            CdcIntegerMetaFieldType.jsonEncoder.encode(0),
        )
        if (globalStateValue == null) {
            return
        }
        val offset: DebeziumOffset =
            MySqlSourceDebeziumOperations.deserializeStateUnvalidated(globalStateValue).offset
        val position: MySqlSourceCdcPosition = MySqlSourceDebeziumOperations.position(offset)
        recordData.set<JsonNode>(
            MySqlSourceCdcMetaFields.CDC_LOG_FILE.id,
            CdcStringMetaFieldType.jsonEncoder.encode(position.fileName),
        )
        recordData.set<JsonNode>(
            MySqlSourceCdcMetaFields.CDC_LOG_POS.id,
            CdcIntegerMetaFieldType.jsonEncoder.encode(position.position),
        )
    }

    override fun toFieldType(c: JdbcMetadataQuerier.ColumnMetadata): FieldType =
        when (val type = c.type) {
            is SystemType -> leafType(type)
            else -> PokemonFieldType
        }

    private fun leafType(type: SystemType): JdbcFieldType<*> {
        return when (MysqlType.getByName(type.typeName)) {
            MysqlType.BIT -> if (type.precision == 1) BooleanFieldType else BytesFieldType
            MysqlType.BOOLEAN -> BooleanFieldType
            MysqlType.TINYINT,
            MysqlType.TINYINT_UNSIGNED,
            MysqlType.YEAR -> ShortFieldType
            MysqlType.SMALLINT,
            MysqlType.SMALLINT_UNSIGNED,
            MysqlType.MEDIUMINT,
            MysqlType.MEDIUMINT_UNSIGNED,
            MysqlType.INT -> IntFieldType
            MysqlType.INT_UNSIGNED,
            MysqlType.BIGINT -> LongFieldType
            MysqlType.BIGINT_UNSIGNED -> BigIntegerFieldType
            MysqlType.FLOAT,
            MysqlType.FLOAT_UNSIGNED, ->
                if ((type.precision ?: 0) <= 23) FloatFieldType else DoubleFieldType
            MysqlType.DOUBLE,
            MysqlType.DOUBLE_UNSIGNED -> DoubleFieldType
            MysqlType.DECIMAL,
            MysqlType.DECIMAL_UNSIGNED -> {
                if (type.scale == 0) BigIntegerFieldType else BigDecimalFieldType
            }
            MysqlType.DATE -> LocalDateFieldType
            MysqlType.DATETIME -> LocalDateTimeFieldType
            MysqlType.TIMESTAMP -> OffsetDateTimeFieldType
            MysqlType.TIME -> LocalTimeFieldType
            MysqlType.CHAR,
            MysqlType.VARCHAR,
            MysqlType.TINYTEXT,
            MysqlType.TEXT,
            MysqlType.MEDIUMTEXT,
            MysqlType.LONGTEXT,
            MysqlType.ENUM,
            MysqlType.SET -> StringFieldType
            MysqlType.JSON -> StringFieldType // TODO: replace this with JsonStringFieldType
            MysqlType.TINYBLOB,
            MysqlType.BLOB,
            MysqlType.MEDIUMBLOB,
            MysqlType.LONGBLOB,
            MysqlType.BINARY,
            MysqlType.VARBINARY,
            MysqlType.GEOMETRY -> BinaryStreamFieldType
            MysqlType.NULL -> NullFieldType
            MysqlType.VECTOR,
            MysqlType.UNKNOWN,
            null -> PokemonFieldType
        }
    }

    override fun generate(ast: SelectQuerySpec): SelectQuery =
        SelectQuery(ast.sql(), ast.select.columns, ast.bindings())

    fun SelectQuerySpec.sql(): String {
        val components: List<String> = listOf(select.sql(), from.sql(), where.sql(), orderBy.sql())
        val sqlWithoutLimit: String = components.filter { it.isNotBlank() }.joinToString(" ")
        val rownumClause: String =
            when (limit) {
                NoLimit -> return sqlWithoutLimit
                Limit(0) -> "LIMIT 0"
                is Limit -> "LIMIT ?"
            }
        return "$sqlWithoutLimit $rownumClause"
    }

    fun SelectNode.sql(): String =
        "SELECT " +
            when (this) {
                is SelectColumns -> columns.joinToString(", ") { it.sql() }
                is SelectColumnMaxValue -> "MAX(${column.sql()})"
            }

    fun Field.sql(): String = "`$id`"

    fun FromNode.sql(): String =
        when (this) {
            NoFrom -> ""
            is From -> if (this.namespace == null) "FROM `$name`" else "FROM `$namespace`.`$name`"
            // just return the first sample_size of rows from the table for the best performance
            is FromSample -> From(name, namespace).sql()
        }

    fun WhereNode.sql(): String =
        when (this) {
            NoWhere -> ""
            is Where -> "WHERE ${clause.sql()}"
        }

    fun WhereClauseNode.sql(): String =
        when (this) {
            is And -> conj.joinToString(") AND (", "(", ")") { it.sql() }
            is Or -> disj.joinToString(") OR (", "(", ")") { it.sql() }
            is Equal -> "${column.sql()} = ?"
            is Greater -> "${column.sql()} > ?"
            is GreaterOrEqual -> "${column.sql()} >= ?"
            is LesserOrEqual -> "${column.sql()} <= ?"
            is Lesser -> "${column.sql()} < ?"
        }

    fun OrderByNode.sql(): String =
        when (this) {
            NoOrderBy -> ""
            is OrderBy -> "ORDER BY " + columns.joinToString(", ") { it.sql() }
        }

    fun SelectQuerySpec.bindings(): List<SelectQuery.Binding> = where.bindings() + limit.bindings()

    fun WhereNode.bindings(): List<SelectQuery.Binding> =
        when (this) {
            is NoWhere -> listOf()
            is Where -> clause.bindings()
        }

    fun WhereClauseNode.bindings(): List<SelectQuery.Binding> =
        when (this) {
            is And -> conj.flatMap { it.bindings() }
            is Or -> disj.flatMap { it.bindings() }
            is WhereClauseLeafNode -> {
                val type = column.type as LosslessJdbcFieldType<*, *>
                listOf(SelectQuery.Binding(bindingValue, type))
            }
        }

    fun LimitNode.bindings(): List<SelectQuery.Binding> =
        when (this) {
            NoLimit,
            Limit(0) -> listOf()
            is Limit -> listOf(SelectQuery.Binding(Jsons.numberNode(n), LongFieldType))
        }
}
