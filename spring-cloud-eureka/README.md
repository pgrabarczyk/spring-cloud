# spring-cloud-eureka
Spring cloud applications presents use of spring cloud eureka discovery service.

### Run
1. run eureka-server, then eureka dashboard should be available at http://localhost:8761
2. run eureka-service, then service will register in server and should be visible on eureka dashboard
3. run eureka-client, then enter http://localhost:8080/ - the client takes "eureka-service" ip from eureka-server then display it
