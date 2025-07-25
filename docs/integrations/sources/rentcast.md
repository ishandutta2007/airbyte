# RentCast
RentCast is the leading rental property analytics, estimation and reporting software .
This connector enables you to extract data from endpoints like Value Estimate , Rent Estimate , Property Records , Sale Listings and Rental Listings
Docs : https://developers.rentcast.io/reference/introduction

## Configuration

| Input | Type | Description | Default Value |
|-------|------|-------------|---------------|
| `api_key` | `string` | API Key.  |  |
| `address` | `string` | Address. The full address of the property, in the format of Street, City, State, Zip. Used to retrieve data for a specific property, or together with the radius parameter to search for listings in a specific area |  |
| `city` | `string` | City. The name of the city, used to search for listings in a specific city. This parameter is case-sensitive |  |
| `state` | `string` | State. The 2-character state abbreviation, used to search for listings in a specific state. This parameter is case-sensitive |  |
| `zipcode` | `string` | Zip Code. The 5-digit zip code, used to search for listings in a specific zip code |  |
| `latitude` | `string` | Latitude. The latitude of the search area. Use the latitude/longitude and radius parameters to search for listings in a specific area |  |
| `longitude` | `string` | Longitude. The longitude of the search area. Use the latitude/longitude and radius parameters to search for listings in a specific area |  |
| `radius` | `string` | Radius. The radius of the search area in miles, with a maximum of 100. Use in combination with the latitude/longitude or address parameters to search for listings in a specific area |  |
| `property_type` | `string` | Property Type. The type of the property, used to search for listings matching this criteria : Single Family , Condo , Townhouse , Manufactured ,  Multi-Family , Apartment , Land , |  |
| `bedrooms` | `number` | Bedrooms. The number of bedrooms, used to search for listings matching this criteria. Use 0 to indicate a studio layout |  |
| `bath_rooms` | `integer` | Bath Rooms. The number of bathrooms, used to search for listings matching this criteria. Supports fractions to indicate partial bathrooms |  |
| `status` | `string` | Status. The current listing status, used to search for listings matching this criteria : Active or Inactive |  |
| `days_old` | `string` | Days Old. The maximum number of days since a property was listed on the market, with a minimum of 1 or The maximum number of days since a property was last sold, with a minimum of 1. Used to search for properties that were sold within the specified date range |  |
| `data_type_` | `string` | Data Type . The type of aggregate market data to return. Defaults to &quot;All&quot; if not provided : All , Sale , Rental |  |
| `history_range` | `string` | History Range. The time range for historical record entries, in months. Defaults to 12 if not provided |  |

## Streams
| Stream Name | Primary Key | Pagination | Supports Full Sync | Supports Incremental |
|-------------|-------------|------------|---------------------|----------------------|
| Property Records | id | DefaultPaginator | ✅ |  ❌  |
| Sale Listings | id | DefaultPaginator | ✅ |  ❌  |
| Rental Listings | id | No pagination | ✅ |  ❌  |
| Statistics |  | No pagination | ✅ |  ❌  |
| Value Estimate |  | No pagination | ✅ |  ❌  |
| Rent Estimate |  | No pagination | ✅ |  ❌  |

## Changelog

<details>
  <summary>Expand to review</summary>

| Version          | Date              | Pull Request | Subject        |
|------------------|-------------------|--------------|----------------|
| 0.0.29 | 2025-07-26 | [63945](https://github.com/airbytehq/airbyte/pull/63945) | Update dependencies |
| 0.0.28 | 2025-07-05 | [62745](https://github.com/airbytehq/airbyte/pull/62745) | Update dependencies |
| 0.0.27 | 2025-06-28 | [62282](https://github.com/airbytehq/airbyte/pull/62282) | Update dependencies |
| 0.0.26 | 2025-06-21 | [61790](https://github.com/airbytehq/airbyte/pull/61790) | Update dependencies |
| 0.0.25 | 2025-06-14 | [61298](https://github.com/airbytehq/airbyte/pull/61298) | Update dependencies |
| 0.0.24 | 2025-05-25 | [60442](https://github.com/airbytehq/airbyte/pull/60442) | Update dependencies |
| 0.0.23 | 2025-05-10 | [60079](https://github.com/airbytehq/airbyte/pull/60079) | Update dependencies |
| 0.0.22 | 2025-05-04 | [59586](https://github.com/airbytehq/airbyte/pull/59586) | Update dependencies |
| 0.0.21 | 2025-04-27 | [59053](https://github.com/airbytehq/airbyte/pull/59053) | Update dependencies |
| 0.0.20 | 2025-04-19 | [58507](https://github.com/airbytehq/airbyte/pull/58507) | Update dependencies |
| 0.0.19 | 2025-04-12 | [58001](https://github.com/airbytehq/airbyte/pull/58001) | Update dependencies |
| 0.0.18 | 2025-04-05 | [57343](https://github.com/airbytehq/airbyte/pull/57343) | Update dependencies |
| 0.0.17 | 2025-03-29 | [56766](https://github.com/airbytehq/airbyte/pull/56766) | Update dependencies |
| 0.0.16 | 2025-03-22 | [56235](https://github.com/airbytehq/airbyte/pull/56235) | Update dependencies |
| 0.0.15 | 2025-03-08 | [55564](https://github.com/airbytehq/airbyte/pull/55564) | Update dependencies |
| 0.0.14 | 2025-03-01 | [55036](https://github.com/airbytehq/airbyte/pull/55036) | Update dependencies |
| 0.0.13 | 2025-02-23 | [54603](https://github.com/airbytehq/airbyte/pull/54603) | Update dependencies |
| 0.0.12 | 2025-02-15 | [53997](https://github.com/airbytehq/airbyte/pull/53997) | Update dependencies |
| 0.0.11 | 2025-02-08 | [53500](https://github.com/airbytehq/airbyte/pull/53500) | Update dependencies |
| 0.0.10 | 2025-02-01 | [53025](https://github.com/airbytehq/airbyte/pull/53025) | Update dependencies |
| 0.0.9 | 2025-01-25 | [52538](https://github.com/airbytehq/airbyte/pull/52538) | Update dependencies |
| 0.0.8 | 2025-01-18 | [51910](https://github.com/airbytehq/airbyte/pull/51910) | Update dependencies |
| 0.0.7 | 2025-01-11 | [51352](https://github.com/airbytehq/airbyte/pull/51352) | Update dependencies |
| 0.0.6 | 2024-12-28 | [50730](https://github.com/airbytehq/airbyte/pull/50730) | Update dependencies |
| 0.0.5 | 2024-12-21 | [50254](https://github.com/airbytehq/airbyte/pull/50254) | Update dependencies |
| 0.0.4 | 2024-12-14 | [49666](https://github.com/airbytehq/airbyte/pull/49666) | Update dependencies |
| 0.0.3 | 2024-12-12 | [49345](https://github.com/airbytehq/airbyte/pull/49345) | Update dependencies |
| 0.0.2 | 2024-12-11 | [47604](https://github.com/airbytehq/airbyte/pull/47604) | Starting with this version, the Docker image is now rootless. Please note that this and future versions will not be compatible with Airbyte versions earlier than 0.64 |
| 0.0.1 | 2024-10-18 | | Initial release by [@ombhardwajj](https://github.com/ombhardwajj) via Connector Builder |

</details>
