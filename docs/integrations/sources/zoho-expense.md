# Zoho Expense
Zoho Expense connector enables seamless data synchronization between Zoho Expense and various destinations. This connector automates expense tracking workflows by extracting financial data efficiently, ensuring accurate reporting and streamlined operations.

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `client_id` | `string` | OAuth Client ID.  |  |
| `client_secret` | `string` | OAuth Client Secret.  |  |
| `refresh_token` | `string` | OAuth Refresh Token.  |  |
| `data_center` | `string` | Data Center. The domain suffix for the Zoho Expense API based on your data center location (e.g., `com`, `in`, `jp` etc.) | `com` |


## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| users | user_id | DefaultPaginator | ✅ |  ❌  |
| trips | trip_id | DefaultPaginator | ✅ |  ❌  |
| expense_reports | report_id | DefaultPaginator | ✅ |  ❌  |
| projects |  | DefaultPaginator | ✅ |  ❌  |
| customers | contact_id | DefaultPaginator | ✅ |  ❌  |
| organizations | organization_id | DefaultPaginator | ✅ |  ❌  |
| expense_categories | category_id | DefaultPaginator | ✅ |  ❌  |
| currencies | currency_id | DefaultPaginator | ✅ |  ❌  |
| taxes | tax_id | DefaultPaginator | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.28 | 2025-07-26 | [64062](https://github.com/airbytehq/airbyte/pull/64062) | Update dependencies |
| 0.0.27 | 2025-07-20 | [63665](https://github.com/airbytehq/airbyte/pull/63665) | Update dependencies |
| 0.0.26 | 2025-07-12 | [63224](https://github.com/airbytehq/airbyte/pull/63224) | Update dependencies |
| 0.0.25 | 2025-07-05 | [62717](https://github.com/airbytehq/airbyte/pull/62717) | Update dependencies |
| 0.0.24 | 2025-06-28 | [62263](https://github.com/airbytehq/airbyte/pull/62263) | Update dependencies |
| 0.0.23 | 2025-06-21 | [61761](https://github.com/airbytehq/airbyte/pull/61761) | Update dependencies |
| 0.0.22 | 2025-06-15 | [61161](https://github.com/airbytehq/airbyte/pull/61161) | Update dependencies |
| 0.0.21 | 2025-05-24 | [60784](https://github.com/airbytehq/airbyte/pull/60784) | Update dependencies |
| 0.0.20 | 2025-05-10 | [59964](https://github.com/airbytehq/airbyte/pull/59964) | Update dependencies |
| 0.0.19 | 2025-05-04 | [59559](https://github.com/airbytehq/airbyte/pull/59559) | Update dependencies |
| 0.0.18 | 2025-04-26 | [58928](https://github.com/airbytehq/airbyte/pull/58928) | Update dependencies |
| 0.0.17 | 2025-04-19 | [58560](https://github.com/airbytehq/airbyte/pull/58560) | Update dependencies |
| 0.0.16 | 2025-04-12 | [58021](https://github.com/airbytehq/airbyte/pull/58021) | Update dependencies |
| 0.0.15 | 2025-04-05 | [57405](https://github.com/airbytehq/airbyte/pull/57405) | Update dependencies |
| 0.0.14 | 2025-03-29 | [56822](https://github.com/airbytehq/airbyte/pull/56822) | Update dependencies |
| 0.0.13 | 2025-03-22 | [56343](https://github.com/airbytehq/airbyte/pull/56343) | Update dependencies |
| 0.0.12 | 2025-03-09 | [55652](https://github.com/airbytehq/airbyte/pull/55652) | Update dependencies |
| 0.0.11 | 2025-03-01 | [55167](https://github.com/airbytehq/airbyte/pull/55167) | Update dependencies |
| 0.0.10 | 2025-02-23 | [54637](https://github.com/airbytehq/airbyte/pull/54637) | Update dependencies |
| 0.0.9 | 2025-02-15 | [53599](https://github.com/airbytehq/airbyte/pull/53599) | Update dependencies |
| 0.0.8 | 2025-02-01 | [53117](https://github.com/airbytehq/airbyte/pull/53117) | Update dependencies |
| 0.0.7 | 2025-01-25 | [52547](https://github.com/airbytehq/airbyte/pull/52547) | Update dependencies |
| 0.0.6 | 2025-01-18 | [51935](https://github.com/airbytehq/airbyte/pull/51935) | Update dependencies |
| 0.0.5 | 2025-01-11 | [51461](https://github.com/airbytehq/airbyte/pull/51461) | Update dependencies |
| 0.0.4 | 2024-12-28 | [50831](https://github.com/airbytehq/airbyte/pull/50831) | Update dependencies |
| 0.0.3 | 2024-12-21 | [50385](https://github.com/airbytehq/airbyte/pull/50385) | Update dependencies |
| 0.0.2 | 2024-12-14 | [49453](https://github.com/airbytehq/airbyte/pull/49453) | Update dependencies |
| 0.0.1 | 2024-10-26 | | Initial release by [@bishalbera](https://github.com/bishalbera) via Connector Builder |

</details>
