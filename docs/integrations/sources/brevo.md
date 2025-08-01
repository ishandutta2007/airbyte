# Brevo
This page contains the setup guide and reference information for the [Brevo](https://www.brevo.com/) source connector.

## Documentation reference:
Visit `https://developers.brevo.com/reference/getting-started-1` for API documentation

## Authentication setup
Brevo uses api key authentication,
Visit `https://app.brevo.com/settings/keys/api` for getting your api key.

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `api_key` | `string` | API Key.  |  |
| `start_date` | `string` | Start date.  |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| contacts | id | DefaultPaginator | ✅ |  ✅  |
| contacts_attributes |  | DefaultPaginator | ❌ |  ❌  |
| contacts_folders_lists | id | DefaultPaginator | ✅ |  ❌  |
| contacts_folders | id | DefaultPaginator | ✅ |  ❌  |
| contacts_segments | id | DefaultPaginator | ✅ |  ❌  |
| contacts_lists_contacts |  | DefaultPaginator | ✅ |  ✅  |
| contacts_lists | id | DefaultPaginator | ✅ |  ❌  |
| senders | id | DefaultPaginator | ✅ |  ❌  |
| companies | id | DefaultPaginator | ✅ |  ✅ |
| companies_attributes |  | DefaultPaginator | ✅ |  ❌  |
| crm_pipeline_stages | id | DefaultPaginator | ✅ |  ❌  |
| crm_pipeline_details_all | pipeline | DefaultPaginator | ✅ |  ❌  |
| crm_attributes_deals |  | DefaultPaginator | ✅ |  ❌  |
| crm_deals | id | DefaultPaginator | ✅ |  ✅  |
| crm_tasktypes | id | DefaultPaginator | ✅ |  ❌  |
| crm_tasks | id | DefaultPaginator | ✅ |  ✅  |
| crm_notes | id | DefaultPaginator | ✅ |  ✅  |
| domains | id | DefaultPaginator | ✅ |  ❌ |
| webhooks | id | No pagination | ✅ |  ❌ |
| account | organization_id | DefaultPaginator | ✅ |  ❌  |
| organization_invited_users | email | DefaultPaginator | ✅ |  ❌  |
| emailCampaigns | id | DefaultPaginator | ✅ |  ✅  |
| smsCampaigns | id | DefaultPaginator | ✅ |  ✅  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date | Pull Request | Subject |
| ------------------ | ------------ | --- | ---------------- |
| 0.2.14 | 2025-07-12 | [63047](https://github.com/airbytehq/airbyte/pull/63047) | Update dependencies |
| 0.2.13 | 2025-07-05 | [62527](https://github.com/airbytehq/airbyte/pull/62527) | Update dependencies |
| 0.2.12 | 2025-06-28 | [62149](https://github.com/airbytehq/airbyte/pull/62149) | Update dependencies |
| 0.2.11 | 2025-06-21 | [61898](https://github.com/airbytehq/airbyte/pull/61898) | Update dependencies |
| 0.2.10 | 2025-06-15 | [61447](https://github.com/airbytehq/airbyte/pull/61447) | Update dependencies |
| 0.2.9 | 2025-05-24 | [60610](https://github.com/airbytehq/airbyte/pull/60610) | Update dependencies |
| 0.2.8 | 2025-05-10 | [59885](https://github.com/airbytehq/airbyte/pull/59885) | Update dependencies |
| 0.2.7 | 2025-05-05 | [58704](https://github.com/airbytehq/airbyte/pull/59652) | Fix contact pagination |
| 0.2.6 | 2025-05-03 | [58704](https://github.com/airbytehq/airbyte/pull/58704) | Update dependencies |
| 0.2.5 | 2025-04-24 | [57576](https://github.com/airbytehq/airbyte/pull/57576) | Set ordering in ascending on incremental streams |
| 0.2.4 | 2025-04-19 | [57595](https://github.com/airbytehq/airbyte/pull/57595) | Update dependencies |
| 0.2.3 | 2025-04-05 | [57126](https://github.com/airbytehq/airbyte/pull/57126) | Update dependencies |
| 0.2.2 | 2025-03-29 | [56622](https://github.com/airbytehq/airbyte/pull/56622) | Update dependencies |
| 0.2.1 | 2025-03-27 | [56437](https://github.com/airbytehq/airbyte/pull/56437) | Update contacts pagination page size to 1000 |
| 0.2.0 | 2025-03-24 | [56369](https://github.com/airbytehq/airbyte/pull/56369) | Fix/Add incremental on Contacts/Crm deals |
| 0.1.8 | 2025-03-22 | [55367](https://github.com/airbytehq/airbyte/pull/55367) | Update dependencies |
| 0.1.7 | 2025-03-01 | [54874](https://github.com/airbytehq/airbyte/pull/54874) | Update dependencies |
| 0.1.6 | 2025-02-25 | [54674](https://github.com/airbytehq/airbyte/pull/54674) | Fix bug authenticator |
| 0.1.5 | 2025-02-22 | [54223](https://github.com/airbytehq/airbyte/pull/54223) | Update dependencies |
| 0.1.4 | 2025-02-15 | [48282](https://github.com/airbytehq/airbyte/pull/48282) | Update dependencies |
| 0.1.3 | 2024-11-28 | [48737](https://github.com/airbytehq/airbyte/pull/48737) | Update pagination |
| 0.1.2 | 2024-10-29 | [47922](https://github.com/airbytehq/airbyte/pull/47922) | Update dependencies |
| 0.1.1 | 2024-10-28 | [47622](https://github.com/airbytehq/airbyte/pull/47622) | Update dependencies |
| 0.1.0 | 2024-10-08 | [46587](https://github.com/airbytehq/airbyte/pull/46587) | Fix Companies stream paginator+ remove incremental |
| 0.0.1 | 2024-09-11 | [45382](https://github.com/airbytehq/airbyte/pull/45382) | Initial release by [@btkcodedev](https://github.com/btkcodedev) via Connector Builder |

</details>
