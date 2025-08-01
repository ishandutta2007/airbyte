# Lago API

## Sync overview

This source can sync data from the [Lago API](https://doc.getlago.com/docs/guide/intro/welcome). At present this connector only supports full refresh syncs meaning that each time you use the connector it will sync all available records from scratch. Please use cautiously if you expect your API to have a lot of records.

## This Source Supports the Following Streams

- billable_metrics
- plans
- coupons
- add_ons
- invoices
- customers
- subscriptions
- customer_usage
- customer_usage_past

### Features

| Feature           | Supported?\(Yes/No\) | Notes |
| :---------------- | :------------------- | :---- |
| Full Refresh Sync | Yes                  |       |
| Incremental Sync  | No                   |       |

## Getting started

### Requirements

- Lago API URL
- Lago API KEY

## Changelog

| Version | Date       | Pull Request                                              | Subject                                   |
| :------ | :--------- | :-------------------------------------------------------- | :---------------------------------------- |
| 0.7.29 | 2025-07-26 | [63857](https://github.com/airbytehq/airbyte/pull/63857) | Update dependencies |
| 0.7.28 | 2025-07-19 | [63469](https://github.com/airbytehq/airbyte/pull/63469) | Update dependencies |
| 0.7.27 | 2025-07-12 | [63124](https://github.com/airbytehq/airbyte/pull/63124) | Update dependencies |
| 0.7.26 | 2025-07-05 | [62644](https://github.com/airbytehq/airbyte/pull/62644) | Update dependencies |
| 0.7.25 | 2025-06-28 | [62161](https://github.com/airbytehq/airbyte/pull/62161) | Update dependencies |
| 0.7.24 | 2025-06-21 | [61862](https://github.com/airbytehq/airbyte/pull/61862) | Update dependencies |
| 0.7.23 | 2025-06-14 | [61226](https://github.com/airbytehq/airbyte/pull/61226) | Update dependencies |
| 0.7.22 | 2025-05-24 | [60418](https://github.com/airbytehq/airbyte/pull/60418) | Update dependencies |
| 0.7.21 | 2025-05-10 | [59979](https://github.com/airbytehq/airbyte/pull/59979) | Update dependencies |
| 0.7.20 | 2025-05-03 | [58861](https://github.com/airbytehq/airbyte/pull/58861) | Update dependencies |
| 0.7.19 | 2025-04-19 | [58335](https://github.com/airbytehq/airbyte/pull/58335) | Update dependencies |
| 0.7.18 | 2025-04-12 | [57237](https://github.com/airbytehq/airbyte/pull/57237) | Update dependencies |
| 0.7.17 | 2025-03-29 | [56550](https://github.com/airbytehq/airbyte/pull/56550) | Update dependencies |
| 0.7.16 | 2025-03-22 | [55974](https://github.com/airbytehq/airbyte/pull/55974) | Update dependencies |
| 0.7.15 | 2025-03-08 | [54939](https://github.com/airbytehq/airbyte/pull/54939) | Update dependencies |
| 0.7.14 | 2025-03-04 | [55179](https://github.com/airbytehq/airbyte/pull/55179) | Replace double partition router with extra_fields, fix wallets stream |
| 0.7.13 | 2025-02-22 | [54382](https://github.com/airbytehq/airbyte/pull/54382) | Update dependencies |
| 0.7.12 | 2025-02-15 | [53772](https://github.com/airbytehq/airbyte/pull/53772) | Update dependencies |
| 0.7.11 | 2025-02-08 | [53370](https://github.com/airbytehq/airbyte/pull/53370) | Update dependencies |
| 0.7.10 | 2025-02-01 | [52860](https://github.com/airbytehq/airbyte/pull/52860) | Update dependencies |
| 0.7.9 | 2025-01-25 | [52368](https://github.com/airbytehq/airbyte/pull/52368) | Update dependencies |
| 0.7.8 | 2025-01-18 | [51667](https://github.com/airbytehq/airbyte/pull/51667) | Update dependencies |
| 0.7.7 | 2025-01-11 | [51126](https://github.com/airbytehq/airbyte/pull/51126) | Update dependencies |
| 0.7.6 | 2024-12-28 | [50575](https://github.com/airbytehq/airbyte/pull/50575) | Update dependencies |
| 0.7.5 | 2024-12-21 | [50044](https://github.com/airbytehq/airbyte/pull/50044) | Update dependencies |
| 0.7.4 | 2024-12-14 | [49504](https://github.com/airbytehq/airbyte/pull/49504) | Update dependencies |
| 0.7.3 | 2024-12-12 | [48208](https://github.com/airbytehq/airbyte/pull/48208) | Update dependencies |
| 0.7.2 | 2024-10-29 | [47730](https://github.com/airbytehq/airbyte/pull/47730) | Update dependencies |
| 0.7.1 | 2024-10-28 | [47596](https://github.com/airbytehq/airbyte/pull/47596) | Update dependencies |
| 0.7.0 | 2024-09-12 | [45452](https://github.com/airbytehq/airbyte/pull/45452) | Endpoint customer usage: import current from subscription and add new stream customer_usage_past |
| 0.6.0 | 2024-09-06 | [45193](https://github.com/airbytehq/airbyte/pull/45193) | Endpoint customer usage ignore 405 response |
| 0.5.0 | 2024-08-23 | [44613](https://github.com/airbytehq/airbyte/pull/44613) | Refactor connector to manifest-only format |
| 0.4.11 | 2024-08-17 | [44273](https://github.com/airbytehq/airbyte/pull/44273) | Update dependencies |
| 0.4.10 | 2024-08-12 | [43800](https://github.com/airbytehq/airbyte/pull/43800) | Update dependencies |
| 0.4.9 | 2024-08-10 | [43655](https://github.com/airbytehq/airbyte/pull/43655) | Update dependencies |
| 0.4.8 | 2024-08-03 | [43099](https://github.com/airbytehq/airbyte/pull/43099) | Update dependencies |
| 0.4.7 | 2024-07-27 | [42727](https://github.com/airbytehq/airbyte/pull/42727) | Update dependencies |
| 0.4.6 | 2024-07-20 | [41719](https://github.com/airbytehq/airbyte/pull/41719) | Update dependencies |
| 0.4.5 | 2024-07-10 | [41523](https://github.com/airbytehq/airbyte/pull/41523) | Update dependencies |
| 0.4.4 | 2024-07-09 | [41133](https://github.com/airbytehq/airbyte/pull/41133) | Update dependencies |
| 0.4.3 | 2024-07-06 | [40786](https://github.com/airbytehq/airbyte/pull/40786) | Update dependencies |
| 0.4.2 | 2024-06-25 | [40265](https://github.com/airbytehq/airbyte/pull/40265) | Update dependencies |
| 0.4.1 | 2024-06-22 | [39979](https://github.com/airbytehq/airbyte/pull/39979) | Update dependencies |
| 0.4.0 | 2024-06-13 | [35661](https://github.com/airbytehq/airbyte/pull/35661) | Add `fee` stream |
| 0.3.2 | 2024-06-04 | [39094](https://github.com/airbytehq/airbyte/pull/39094) | [autopull] Upgrade base image to v1.2.1 |
| 0.3.1 | 2024-05-21 | [38479](https://github.com/airbytehq/airbyte/pull/38479) | [autopull] base image + poetry + up_to_date |
| 0.3.0   | 2023-10-05 | [#31099](https://github.com/airbytehq/airbyte/pull/31099) | Added customer_usage and wallet stream    |
| 0.2.0   | 2023-09-19 | [#30572](https://github.com/airbytehq/airbyte/pull/30572) | Source GetLago: Support API URL           |
| 0.1.0   | 2022-10-26 | [#18727](https://github.com/airbytehq/airbyte/pull/18727) | 🎉 New Source: getLago API [low-code CDK] |
