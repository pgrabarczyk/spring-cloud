# spring-cloud-config
Spring cloud applications presents use of spring cloud config server and client.


### Configuration
ReportController in client have 2 fields annotared with @Value. Those values are injected from config-server from files:
```
spring-cloud-config-server/src/main/resources/config/report/report-qa.properties
spring-cloud-config-server/src/main/resources/config/report/report.properties
```

In client-report you can decide which profile of report*.properties use. ( qa | default )
Search for:

```
spring.cloud.config.profile=qa
```
in:
```
spring-cloud-config-client-report/src/main/resources/bootstrap.properties
```

### Run
First run config server.
Then run config client-report.

Then send request via HTTP.GET:
```
http://localhost:9001
```

Values from config should appear.
