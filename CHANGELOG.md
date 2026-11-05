# Changelog

## [0.3.0](https://github.com/scalar/galaxy-java/compare/v0.2.0...v0.3.0) (2026-11-05)


### ⚠ BREAKING CHANGES

* **api:** 2 breaking changes to the SDK surface.
    - Response of `planets.list` changed from `paginated_resource` to an unnamed `application/json` body.
    - Removed schema `paginated_resource`.
* **api:** 5 breaking changes to the SDK surface.
    - Removed operation `planets.listAllData` (`GET /planets`).
    - Removed operation `planets.delteImage` (`POST /planets/{planetId}/image`).
    - Removed schema `ListAllDataResponseHeaders`.
    - Removed schema `DelteImageResponseHeaders`.
    - Removed schema `DelteImageStatus400ResponseHeaders`.

### Features

* **api:** remove operation planets.listAllData (+9 more changes) ([2ab70db](https://github.com/scalar/galaxy-java/commit/2ab70db18a3a01efbf6e0d48db7cebd1eeb5f13e))
* **api:** update response of planets.list (+2 more changes) ([c9f8cfd](https://github.com/scalar/galaxy-java/commit/c9f8cfdd5abbaa40feb99a25a03869fea4c50b22))

## [0.2.0](https://github.com/scalar/galaxy-java/compare/v0.1.0...v0.2.0) (2026-10-23)


### Features

* **api:** initial SDK generation ([204cbb0](https://github.com/scalar/galaxy-java/commit/204cbb0f6a3ac8b5d7f8a4fe7705df8663d54098))


### Chores

* **api:** update generated SDK content ([fe48885](https://github.com/scalar/galaxy-java/commit/fe48885511d0ae9586ac7463f5d7d1b9d46fe6b4))
* **api:** update generated SDK content ([ac5e267](https://github.com/scalar/galaxy-java/commit/ac5e267f98476738561f9f29db6eccdd62960a74))
