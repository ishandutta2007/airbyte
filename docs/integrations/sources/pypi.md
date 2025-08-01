# PyPI

This page guides you through the process of setting up the PyPI source connector.

## Setup guide

### Get package name from PyPI

This is the name given in `pip install package_name` box. For example, `airbyte-cdk` is the package name for [airbyte-cdk](https://pypi.org/project/airbyte-cdk/).

Optianlly, provide a version name. If not provided, the release stream, containing data for particular version, cannot be used. The project stream is as same as release stream but contains data for all versions.

## Supported streams and sync modes

- [Project](https://warehouse.pypa.io/api-reference/json.html#project)
- [Release](https://warehouse.pypa.io/api-reference/json.html#release)
- [Stats](https://warehouse.pypa.io/api-reference/stats.html)

### Performance considerations

Due to the heavy caching and CDN use, there is currently no rate limiting of PyPI APIs at the edge.

In addition, PyPI reserves the right to temporarily or permanently prohibit a consumer based on irresponsible activity.

Try not to make a lot of requests (thousands) in a short amount of time (minutes). Generally PyPI can handle it, but it’s preferred to make requests in serial over a longer amount of time if possible.

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date       | Pull Request                                             | Subject                                                                         |
| :------ | :--------- | :------------------------------------------------------- | :------------------------------------------------------------------------------ |
| 0.2.29 | 2025-07-26 | [63829](https://github.com/airbytehq/airbyte/pull/63829) | Update dependencies |
| 0.2.28 | 2025-07-19 | [63411](https://github.com/airbytehq/airbyte/pull/63411) | Update dependencies |
| 0.2.27 | 2025-07-12 | [63260](https://github.com/airbytehq/airbyte/pull/63260) | Update dependencies |
| 0.2.26 | 2025-06-28 | [62312](https://github.com/airbytehq/airbyte/pull/62312) | Update dependencies |
| 0.2.25 | 2025-06-21 | [61910](https://github.com/airbytehq/airbyte/pull/61910) | Update dependencies |
| 0.2.24 | 2025-06-14 | [61047](https://github.com/airbytehq/airbyte/pull/61047) | Update dependencies |
| 0.2.23 | 2025-05-24 | [60527](https://github.com/airbytehq/airbyte/pull/60527) | Update dependencies |
| 0.2.22 | 2025-05-10 | [60187](https://github.com/airbytehq/airbyte/pull/60187) | Update dependencies |
| 0.2.21 | 2025-05-03 | [59456](https://github.com/airbytehq/airbyte/pull/59456) | Update dependencies |
| 0.2.20 | 2025-04-27 | [59062](https://github.com/airbytehq/airbyte/pull/59062) | Update dependencies |
| 0.2.19 | 2025-04-19 | [58460](https://github.com/airbytehq/airbyte/pull/58460) | Update dependencies |
| 0.2.18 | 2025-04-12 | [57309](https://github.com/airbytehq/airbyte/pull/57309) | Update dependencies |
| 0.2.17 | 2025-03-29 | [56734](https://github.com/airbytehq/airbyte/pull/56734) | Update dependencies |
| 0.2.16 | 2025-03-22 | [56199](https://github.com/airbytehq/airbyte/pull/56199) | Update dependencies |
| 0.2.15 | 2025-03-08 | [55518](https://github.com/airbytehq/airbyte/pull/55518) | Update dependencies |
| 0.2.14 | 2025-03-01 | [55035](https://github.com/airbytehq/airbyte/pull/55035) | Update dependencies |
| 0.2.13 | 2025-02-23 | [54578](https://github.com/airbytehq/airbyte/pull/54578) | Update dependencies |
| 0.2.12 | 2025-02-15 | [53944](https://github.com/airbytehq/airbyte/pull/53944) | Update dependencies |
| 0.2.11 | 2025-02-08 | [53449](https://github.com/airbytehq/airbyte/pull/53449) | Update dependencies |
| 0.2.10 | 2025-02-01 | [52965](https://github.com/airbytehq/airbyte/pull/52965) | Update dependencies |
| 0.2.9 | 2025-01-25 | [52489](https://github.com/airbytehq/airbyte/pull/52489) | Update dependencies |
| 0.2.8 | 2025-01-18 | [51874](https://github.com/airbytehq/airbyte/pull/51874) | Update dependencies |
| 0.2.7 | 2025-01-11 | [51360](https://github.com/airbytehq/airbyte/pull/51360) | Update dependencies |
| 0.2.6 | 2024-12-28 | [50677](https://github.com/airbytehq/airbyte/pull/50677) | Update dependencies |
| 0.2.5 | 2024-12-21 | [50252](https://github.com/airbytehq/airbyte/pull/50252) | Update dependencies |
| 0.2.4 | 2024-12-14 | [49682](https://github.com/airbytehq/airbyte/pull/49682) | Update dependencies |
| 0.2.3 | 2024-12-12 | [48312](https://github.com/airbytehq/airbyte/pull/48312) | Update dependencies |
| 0.2.2 | 2024-10-28 | [47528](https://github.com/airbytehq/airbyte/pull/47528) | Update dependencies |
| 0.2.1 | 2024-08-16 | [44196](https://github.com/airbytehq/airbyte/pull/44196) | Bump source-declarative-manifest version |
| 0.2.0 | 2024-08-14 | [44082](https://github.com/airbytehq/airbyte/pull/44082) | Refactor connector to manifest-only format |
| 0.1.15 | 2024-08-10 | [43643](https://github.com/airbytehq/airbyte/pull/43643) | Update dependencies |
| 0.1.14 | 2024-08-03 | [43137](https://github.com/airbytehq/airbyte/pull/43137) | Update dependencies |
| 0.1.13 | 2024-07-27 | [42790](https://github.com/airbytehq/airbyte/pull/42790) | Update dependencies |
| 0.1.12 | 2024-07-20 | [42210](https://github.com/airbytehq/airbyte/pull/42210) | Update dependencies |
| 0.1.11 | 2024-07-13 | [41844](https://github.com/airbytehq/airbyte/pull/41844) | Update dependencies |
| 0.1.10 | 2024-07-10 | [41464](https://github.com/airbytehq/airbyte/pull/41464) | Update dependencies |
| 0.1.9 | 2024-07-09 | [41078](https://github.com/airbytehq/airbyte/pull/41078) | Update dependencies |
| 0.1.8 | 2024-07-06 | [40842](https://github.com/airbytehq/airbyte/pull/40842) | Update dependencies |
| 0.1.7 | 2024-06-25 | [40459](https://github.com/airbytehq/airbyte/pull/40459) | Update dependencies |
| 0.1.6 | 2024-06-22 | [39952](https://github.com/airbytehq/airbyte/pull/39952) | Update dependencies |
| 0.1.5 | 2024-06-06 | [39152](https://github.com/airbytehq/airbyte/pull/39152) | [autopull] Upgrade base image to v1.2.2 |
| 0.1.4 | 2024-05-28 | [38702](https://github.com/airbytehq/airbyte/pull/38702) | Make connector compatible with the builder |
| 0.1.3 | 2024-04-19 | [37237](https://github.com/airbytehq/airbyte/pull/37237) | Upgrade to CDK 0.80.0 and manage dependencies with Poetry. |
| 0.1.2 | 2024-04-15 | [37237](https://github.com/airbytehq/airbyte/pull/37237) | Base image migration: remove Dockerfile and use the python-connector-base image |
| 0.1.1 | 2024-04-12 | [37237](https://github.com/airbytehq/airbyte/pull/37237) | schema descriptions |
| 0.1.0 | 2022-10-29 | [18632](https://github.com/airbytehq/airbyte/pull/18632) | Initial Release |

</details>
