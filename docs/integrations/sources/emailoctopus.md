# EmailOctopus

## Requirements

- [EmailOctopus account](https://help.emailoctopus.com)
- EmailOctopus [API key](https://help.emailoctopus.com/article/165-how-to-create-and-delete-api-keys)

## Supported sync modes

| Feature           | Supported?\(Yes/No\) | Notes                                                                                          |
| :---------------- | :------------------- | :--------------------------------------------------------------------------------------------- |
| Full Refresh Sync | Yes                  | [Overwrite](https://docs.airbyte.com/understanding-airbyte/connections/full-refresh-overwrite) |
| Incremental Sync  | No                   |                                                                                                |

## Supported Streams

- [Get all campaigns](https://emailoctopus.com/api-documentation/campaigns/get-all)
- [Get all lists](https://emailoctopus.com/api-documentation/lists/get-all)

## Performance considerations

No documented strict rate limit.

## Changelog

<details>
  <summary>Expand to review</summary>

| Version | Date       | Pull Request                                             | Subject                                                                         |
| :------ | :--------- | :------------------------------------------------------- | :------------------------------------------------------------------------------ |
| 0.2.30 | 2025-07-26 | [64001](https://github.com/airbytehq/airbyte/pull/64001) | Update dependencies |
| 0.2.29 | 2025-07-19 | [63587](https://github.com/airbytehq/airbyte/pull/63587) | Update dependencies |
| 0.2.28 | 2025-07-12 | [62970](https://github.com/airbytehq/airbyte/pull/62970) | Update dependencies |
| 0.2.27 | 2025-07-05 | [62791](https://github.com/airbytehq/airbyte/pull/62791) | Update dependencies |
| 0.2.26 | 2025-06-28 | [62394](https://github.com/airbytehq/airbyte/pull/62394) | Update dependencies |
| 0.2.25 | 2025-06-21 | [61982](https://github.com/airbytehq/airbyte/pull/61982) | Update dependencies |
| 0.2.24 | 2025-06-14 | [60383](https://github.com/airbytehq/airbyte/pull/60383) | Update dependencies |
| 0.2.23 | 2025-05-10 | [59928](https://github.com/airbytehq/airbyte/pull/59928) | Update dependencies |
| 0.2.22 | 2025-05-03 | [59413](https://github.com/airbytehq/airbyte/pull/59413) | Update dependencies |
| 0.2.21 | 2025-04-26 | [58865](https://github.com/airbytehq/airbyte/pull/58865) | Update dependencies |
| 0.2.20 | 2025-04-19 | [57839](https://github.com/airbytehq/airbyte/pull/57839) | Update dependencies |
| 0.2.19 | 2025-04-05 | [57207](https://github.com/airbytehq/airbyte/pull/57207) | Update dependencies |
| 0.2.18 | 2025-03-29 | [56532](https://github.com/airbytehq/airbyte/pull/56532) | Update dependencies |
| 0.2.17 | 2025-03-22 | [55963](https://github.com/airbytehq/airbyte/pull/55963) | Update dependencies |
| 0.2.16 | 2025-03-08 | [55344](https://github.com/airbytehq/airbyte/pull/55344) | Update dependencies |
| 0.2.15 | 2025-03-01 | [54920](https://github.com/airbytehq/airbyte/pull/54920) | Update dependencies |
| 0.2.14 | 2025-02-22 | [54418](https://github.com/airbytehq/airbyte/pull/54418) | Update dependencies |
| 0.2.13 | 2025-02-15 | [53736](https://github.com/airbytehq/airbyte/pull/53736) | Update dependencies |
| 0.2.12 | 2025-02-08 | [53340](https://github.com/airbytehq/airbyte/pull/53340) | Update dependencies |
| 0.2.11 | 2025-02-01 | [52872](https://github.com/airbytehq/airbyte/pull/52872) | Update dependencies |
| 0.2.10 | 2025-01-25 | [52376](https://github.com/airbytehq/airbyte/pull/52376) | Update dependencies |
| 0.2.9 | 2025-01-18 | [51694](https://github.com/airbytehq/airbyte/pull/51694) | Update dependencies |
| 0.2.8 | 2025-01-11 | [51104](https://github.com/airbytehq/airbyte/pull/51104) | Update dependencies |
| 0.2.7 | 2024-12-28 | [50581](https://github.com/airbytehq/airbyte/pull/50581) | Update dependencies |
| 0.2.6 | 2024-12-21 | [50062](https://github.com/airbytehq/airbyte/pull/50062) | Update dependencies |
| 0.2.5 | 2024-12-14 | [49479](https://github.com/airbytehq/airbyte/pull/49479) | Update dependencies |
| 0.2.4 | 2024-12-12 | [48165](https://github.com/airbytehq/airbyte/pull/48165) | Update dependencies |
| 0.2.3 | 2024-10-29 | [47896](https://github.com/airbytehq/airbyte/pull/47896) | Update dependencies |
| 0.2.2 | 2024-10-28 | [47450](https://github.com/airbytehq/airbyte/pull/47450) | Update dependencies |
| 0.2.1 | 2024-08-16 | [44196](https://github.com/airbytehq/airbyte/pull/44196) | Bump source-declarative-manifest version |
| 0.2.0 | 2024-08-15 | [44152](https://github.com/airbytehq/airbyte/pull/44152) | Refactor connector to manifest-only format |
| 0.1.15 | 2024-08-10 | [43580](https://github.com/airbytehq/airbyte/pull/43580) | Update dependencies |
| 0.1.14 | 2024-08-03 | [43069](https://github.com/airbytehq/airbyte/pull/43069) | Update dependencies |
| 0.1.13 | 2024-07-27 | [42799](https://github.com/airbytehq/airbyte/pull/42799) | Update dependencies |
| 0.1.12 | 2024-07-20 | [42167](https://github.com/airbytehq/airbyte/pull/42167) | Update dependencies |
| 0.1.11 | 2024-07-13 | [41797](https://github.com/airbytehq/airbyte/pull/41797) | Update dependencies |
| 0.1.10 | 2024-07-10 | [41447](https://github.com/airbytehq/airbyte/pull/41447) | Update dependencies |
| 0.1.9 | 2024-07-09 | [41283](https://github.com/airbytehq/airbyte/pull/41283) | Update dependencies |
| 0.1.8 | 2024-07-06 | [40920](https://github.com/airbytehq/airbyte/pull/40920) | Update dependencies |
| 0.1.7 | 2024-06-25 | [40307](https://github.com/airbytehq/airbyte/pull/40307) | Update dependencies |
| 0.1.6 | 2024-06-22 | [40100](https://github.com/airbytehq/airbyte/pull/40100) | Update dependencies |
| 0.1.5 | 2024-06-04 | [38945](https://github.com/airbytehq/airbyte/pull/38945) | [autopull] Upgrade base image to v1.2.1 |
| 0.1.4 | 2024-05-28 | [38718](https://github.com/airbytehq/airbyte/pull/38718) | Upgrade to CDK 0.80.0 and manage dependencies with Poetry. |
| 0.1.3 | 2024-04-19 | [37154](https://github.com/airbytehq/airbyte/pull/37154) | Upgrade to CDK 0.80.0 and manage dependencies with Poetry. |
| 0.1.2 | 2024-04-15 | [37154](https://github.com/airbytehq/airbyte/pull/37154) | Base image migration: remove Dockerfile and use the python-connector-base image |
| 0.1.1 | 2024-04-12 | [37154](https://github.com/airbytehq/airbyte/pull/37154) | schema descriptions |
| 0.1.0 | 2022-10-29 | [18647](https://github.com/airbytehq/airbyte/pull/18647) | Initial commit |

</details>
