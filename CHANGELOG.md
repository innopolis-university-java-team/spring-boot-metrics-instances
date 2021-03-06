# Changelog

All notable changes to this project will be documented in this file.

## yyyy-mm-dd

### Added
- Other examples of metrics collecting.

## 2021-08-23

### Added

- Add the `Postgres Exporter` service for scraping `PostgreSQL` stats.

## 2021-07-28

### Added
- Add the `RabbitMq` service.

### Changed
- Change the `Zipkin` Dockerfile && starters in java services.

## 2021-07-22

### Added
- Add `DELETE` method in the `some-api-client` service.

## 2021-07-21

### Added
- Add new service `some-api-client` for the log tracing between services. It's have a `PUT` method.

### Fixed
- Fixe the `ResponseTracingFilter` error, return traceId && spanId in response headers.

### Changed
- Change the project structure.

## 2021-07-19

### Changed
- Change the logback settings.

## 2021-07-18

### Added
- Add the `Exception Controller`.
- Add the `Jaeger` service && tracing in service.

## 2021-07-14

### Changed
- Reorganized project directories.

## 2021-07-13

### Added
- Add the new docker container with sh script for the executing `some-api` (at present is a curl execution for creating new entity).

## 2021-07-12

### Added
- Add update and delete methods realization.

## 2021-07-11

### Changed
- Refactor deployments path.

### Added
- Add the `README.md` file and other project docs.

## 2021-07-07

### Added
- Add the `Loki4j` and configure the `Logback` for logs storing in `Loki`.

## 2021-07-03

### Added
- Add initial project commit with spring boot metrics examples with `Grafna`, `Prometheus` && `Loki` (via `Promtail`).