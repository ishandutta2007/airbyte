# Sigma Computing
This is the setup for the Sigma Computing source that ingests data from the sigma API. 

Sigma is next-generation analytics and business intelligence that scales billions of records using spreadsheets, SQL, Python, or AI—without compromising speed and security https://www.sigmacomputing.com/

In order to use this source, you must first create an account on Sigma Computing. Go to Account General Settings and review the Site section for the Cloud provider, this will be used to find the base url of your API. Compare it at https://help.sigmacomputing.com/reference/get-started-sigma-api

Next, head over to Developer Access and click on create. This will generate your Client ID and Client Secret required by the API. You can learn more about the API here https://help.sigmacomputing.com/reference


## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `client_id` | `string` | Client ID.  |  |
| `client_secret` | `string` | Client secret.  |  |
| `client_refresh_token` | `string` | Refresh token.  |  |
| `oauth_access_token` | `string` | Access token. The current access token. This field might be overridden by the connector based on the token refresh endpoint response. |  |
| `oauth_token_expiry_date` | `string` | Token expiry date. The date the current access token expires in. This field might be overridden by the connector based on the token refresh endpoint response. |  |
| `base_url` | `string` | Base URL. The base url of your sigma organization |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| files | id | DefaultPaginator | ✅ |  ❌  |
| connections | connectionId | DefaultPaginator | ✅ |  ❌  |
| datasets | datasetId | DefaultPaginator | ✅ |  ❌  |
| members | memberId | DefaultPaginator | ✅ |  ❌  |
| teams | teamId | DefaultPaginator | ✅ |  ❌  |
| templates | templateId | DefaultPaginator | ✅ |  ❌  |
| workspaces | workspaceId | DefaultPaginator | ✅ |  ❌  |
| workbooks | workbookId | DefaultPaginator | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.29 | 2025-07-26 | [63968](https://github.com/airbytehq/airbyte/pull/63968) | Update dependencies |
| 0.0.28 | 2025-07-12 | [63069](https://github.com/airbytehq/airbyte/pull/63069) | Update dependencies |
| 0.0.27 | 2025-07-05 | [62695](https://github.com/airbytehq/airbyte/pull/62695) | Update dependencies |
| 0.0.26 | 2025-06-28 | [62208](https://github.com/airbytehq/airbyte/pull/62208) | Update dependencies |
| 0.0.25 | 2025-06-21 | [61309](https://github.com/airbytehq/airbyte/pull/61309) | Update dependencies |
| 0.0.24 | 2025-05-25 | [60448](https://github.com/airbytehq/airbyte/pull/60448) | Update dependencies |
| 0.0.23 | 2025-05-10 | [60102](https://github.com/airbytehq/airbyte/pull/60102) | Update dependencies |
| 0.0.22 | 2025-05-04 | [59593](https://github.com/airbytehq/airbyte/pull/59593) | Update dependencies |
| 0.0.21 | 2025-04-27 | [59036](https://github.com/airbytehq/airbyte/pull/59036) | Update dependencies |
| 0.0.20 | 2025-04-19 | [58410](https://github.com/airbytehq/airbyte/pull/58410) | Update dependencies |
| 0.0.19 | 2025-04-12 | [57964](https://github.com/airbytehq/airbyte/pull/57964) | Update dependencies |
| 0.0.18 | 2025-04-05 | [57460](https://github.com/airbytehq/airbyte/pull/57460) | Update dependencies |
| 0.0.17 | 2025-03-29 | [56320](https://github.com/airbytehq/airbyte/pull/56320) | Update dependencies |
| 0.0.16 | 2025-03-08 | [55590](https://github.com/airbytehq/airbyte/pull/55590) | Update dependencies |
| 0.0.15 | 2025-03-01 | [55152](https://github.com/airbytehq/airbyte/pull/55152) | Update dependencies |
| 0.0.14 | 2025-02-22 | [54464](https://github.com/airbytehq/airbyte/pull/54464) | Update dependencies |
| 0.0.13 | 2025-02-15 | [54036](https://github.com/airbytehq/airbyte/pull/54036) | Update dependencies |
| 0.0.12 | 2025-02-08 | [53530](https://github.com/airbytehq/airbyte/pull/53530) | Update dependencies |
| 0.0.11 | 2025-02-01 | [53073](https://github.com/airbytehq/airbyte/pull/53073) | Update dependencies |
| 0.0.10 | 2025-01-25 | [52411](https://github.com/airbytehq/airbyte/pull/52411) | Update dependencies |
| 0.0.9 | 2025-01-18 | [51994](https://github.com/airbytehq/airbyte/pull/51994) | Update dependencies |
| 0.0.8 | 2025-01-11 | [51387](https://github.com/airbytehq/airbyte/pull/51387) | Update dependencies |
| 0.0.7 | 2024-12-28 | [50780](https://github.com/airbytehq/airbyte/pull/50780) | Update dependencies |
| 0.0.6 | 2024-12-21 | [50325](https://github.com/airbytehq/airbyte/pull/50325) | Update dependencies |
| 0.0.5 | 2024-12-14 | [49775](https://github.com/airbytehq/airbyte/pull/49775) | Update dependencies |
| 0.0.4 | 2024-12-12 | [49396](https://github.com/airbytehq/airbyte/pull/49396) | Update dependencies |
| 0.0.3 | 2024-11-04 | [48150](https://github.com/airbytehq/airbyte/pull/48150) | Update dependencies |
| 0.0.2 | 2024-10-28 | [47514](https://github.com/airbytehq/airbyte/pull/47514) | Update dependencies |
| 0.0.1 | 2024-10-13 | | Initial release by [@aazam-gh](https://github.com/aazam-gh) via Connector Builder |

</details>
