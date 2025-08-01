# Elasticemail
Elasticemail is an email delivery and marketing platform.
Using this connector we extract data from streams such as campaigns , contacts , lists and statistics!
Docs : https://elasticemail.com/developers/api-documentation/rest-api

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `api_key` | `string` | API Key.  |  |
| `scope_type` | `string` | scope type.  |  |
| `from` | `string` | From.  |  |
| `start_date` | `string` | Start date.  |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| campaigns | Name | DefaultPaginator | ✅ |  ❌  |
| contacts | Email | DefaultPaginator | ✅ |  ❌  |
| events |  | DefaultPaginator | ✅ |  ✅  |
| files |  | DefaultPaginator | ✅ |  ❌  |
| inboundroute |  | No pagination | ✅ |  ❌  |
| lists |  | DefaultPaginator | ✅ |  ❌  |
| segments |  | DefaultPaginator | ✅ |  ❌  |
| statistics |  | DefaultPaginator | ✅ |  ❌  |
| templates |  | DefaultPaginator | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.29 | 2025-07-26 | [63985](https://github.com/airbytehq/airbyte/pull/63985) | Update dependencies |
| 0.0.28 | 2025-07-19 | [63569](https://github.com/airbytehq/airbyte/pull/63569) | Update dependencies |
| 0.0.27 | 2025-07-12 | [62974](https://github.com/airbytehq/airbyte/pull/62974) | Update dependencies |
| 0.0.26 | 2025-07-05 | [62821](https://github.com/airbytehq/airbyte/pull/62821) | Update dependencies |
| 0.0.25 | 2025-06-28 | [62425](https://github.com/airbytehq/airbyte/pull/62425) | Update dependencies |
| 0.0.24 | 2025-06-21 | [61949](https://github.com/airbytehq/airbyte/pull/61949) | Update dependencies |
| 0.0.23 | 2025-06-14 | [61208](https://github.com/airbytehq/airbyte/pull/61208) | Update dependencies |
| 0.0.22 | 2025-05-24 | [60375](https://github.com/airbytehq/airbyte/pull/60375) | Update dependencies |
| 0.0.21 | 2025-05-10 | [60037](https://github.com/airbytehq/airbyte/pull/60037) | Update dependencies |
| 0.0.20 | 2025-05-03 | [58835](https://github.com/airbytehq/airbyte/pull/58835) | Update dependencies |
| 0.0.19 | 2025-04-19 | [58298](https://github.com/airbytehq/airbyte/pull/58298) | Update dependencies |
| 0.0.18 | 2025-04-12 | [57813](https://github.com/airbytehq/airbyte/pull/57813) | Update dependencies |
| 0.0.17 | 2025-04-05 | [57251](https://github.com/airbytehq/airbyte/pull/57251) | Update dependencies |
| 0.0.16 | 2025-03-29 | [56529](https://github.com/airbytehq/airbyte/pull/56529) | Update dependencies |
| 0.0.15 | 2025-03-22 | [55924](https://github.com/airbytehq/airbyte/pull/55924) | Update dependencies |
| 0.0.14 | 2025-03-08 | [55283](https://github.com/airbytehq/airbyte/pull/55283) | Update dependencies |
| 0.0.13 | 2025-03-01 | [54960](https://github.com/airbytehq/airbyte/pull/54960) | Update dependencies |
| 0.0.12 | 2025-02-22 | [54393](https://github.com/airbytehq/airbyte/pull/54393) | Update dependencies |
| 0.0.11 | 2025-02-15 | [53726](https://github.com/airbytehq/airbyte/pull/53726) | Update dependencies |
| 0.0.10 | 2025-02-08 | [53373](https://github.com/airbytehq/airbyte/pull/53373) | Update dependencies |
| 0.0.9 | 2025-02-01 | [52857](https://github.com/airbytehq/airbyte/pull/52857) | Update dependencies |
| 0.0.8 | 2025-01-25 | [52337](https://github.com/airbytehq/airbyte/pull/52337) | Update dependencies |
| 0.0.7 | 2025-01-18 | [51651](https://github.com/airbytehq/airbyte/pull/51651) | Update dependencies |
| 0.0.6 | 2025-01-11 | [51113](https://github.com/airbytehq/airbyte/pull/51113) | Update dependencies |
| 0.0.5 | 2024-12-28 | [50588](https://github.com/airbytehq/airbyte/pull/50588) | Update dependencies |
| 0.0.4 | 2024-12-21 | [49989](https://github.com/airbytehq/airbyte/pull/49989) | Update dependencies |
| 0.0.3 | 2024-12-14 | [49522](https://github.com/airbytehq/airbyte/pull/49522) | Update dependencies |
| 0.0.2 | 2024-12-12 | [49195](https://github.com/airbytehq/airbyte/pull/49195) | Update dependencies |
| 0.0.1 | 2024-11-08 | | Initial release by [@ombhardwajj](https://github.com/ombhardwajj) via Connector Builder |

</details>
