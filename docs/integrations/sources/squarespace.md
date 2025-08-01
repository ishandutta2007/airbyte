# Squarespace
The Squarespace connector enables seamless integration with your Squarespace store, allowing you to sync data from various key endpoints

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `api_key` | `string` | API Key. API key to use. Find it at https://developers.squarespace.com/commerce-apis/authentication-and-permissions |  |
| `start_date` | `string` | Start date. Any data before this date will not be replicated. |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| inventory | variantId | DefaultPaginator | ✅ |  ❌  |
| store_pages | id | DefaultPaginator | ✅ |  ❌  |
| products | id | DefaultPaginator | ✅ |  ✅  |
| profiles | id | DefaultPaginator | ✅ |  ❌  |
| orders | id | DefaultPaginator | ✅ |  ✅  |
| transactions | id | DefaultPaginator | ✅ |  ✅  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.26 | 2025-07-12 | [63089](https://github.com/airbytehq/airbyte/pull/63089) | Update dependencies |
| 0.0.25 | 2025-07-05 | [62708](https://github.com/airbytehq/airbyte/pull/62708) | Update dependencies |
| 0.0.24 | 2025-06-28 | [62241](https://github.com/airbytehq/airbyte/pull/62241) | Update dependencies |
| 0.0.23 | 2025-06-14 | [61291](https://github.com/airbytehq/airbyte/pull/61291) | Update dependencies |
| 0.0.22 | 2025-05-24 | [60062](https://github.com/airbytehq/airbyte/pull/60062) | Update dependencies |
| 0.0.21 | 2025-05-04 | [59010](https://github.com/airbytehq/airbyte/pull/59010) | Update dependencies |
| 0.0.20 | 2025-04-19 | [58441](https://github.com/airbytehq/airbyte/pull/58441) | Update dependencies |
| 0.0.19 | 2025-04-12 | [57991](https://github.com/airbytehq/airbyte/pull/57991) | Update dependencies |
| 0.0.18 | 2025-04-05 | [57407](https://github.com/airbytehq/airbyte/pull/57407) | Update dependencies |
| 0.0.17 | 2025-03-29 | [56843](https://github.com/airbytehq/airbyte/pull/56843) | Update dependencies |
| 0.0.16 | 2025-03-22 | [56279](https://github.com/airbytehq/airbyte/pull/56279) | Update dependencies |
| 0.0.15 | 2025-03-08 | [55642](https://github.com/airbytehq/airbyte/pull/55642) | Update dependencies |
| 0.0.14 | 2025-03-01 | [54543](https://github.com/airbytehq/airbyte/pull/54543) | Update dependencies |
| 0.0.13 | 2025-02-15 | [54035](https://github.com/airbytehq/airbyte/pull/54035) | Update dependencies |
| 0.0.12 | 2025-02-08 | [53545](https://github.com/airbytehq/airbyte/pull/53545) | Update dependencies |
| 0.0.11 | 2025-02-01 | [53095](https://github.com/airbytehq/airbyte/pull/53095) | Update dependencies |
| 0.0.10 | 2025-01-25 | [52425](https://github.com/airbytehq/airbyte/pull/52425) | Update dependencies |
| 0.0.9 | 2025-01-18 | [51969](https://github.com/airbytehq/airbyte/pull/51969) | Update dependencies |
| 0.0.8 | 2025-01-11 | [51390](https://github.com/airbytehq/airbyte/pull/51390) | Update dependencies |
| 0.0.7 | 2024-12-28 | [50788](https://github.com/airbytehq/airbyte/pull/50788) | Update dependencies |
| 0.0.6 | 2024-12-21 | [50336](https://github.com/airbytehq/airbyte/pull/50336) | Update dependencies |
| 0.0.5 | 2024-12-14 | [49781](https://github.com/airbytehq/airbyte/pull/49781) | Update dependencies |
| 0.0.4 | 2024-12-12 | [49386](https://github.com/airbytehq/airbyte/pull/49386) | Update dependencies |
| 0.0.3 | 2024-11-04 | [48233](https://github.com/airbytehq/airbyte/pull/48233) | Update dependencies |
| 0.0.2 | 2024-10-29 | [47806](https://github.com/airbytehq/airbyte/pull/47806) | Update dependencies |
| 0.0.1 | 2024-10-10 | | Initial release by [@avirajsingh7](https://github.com/avirajsingh7) via Connector Builder |

</details>
