# spring-cloud-zuul
Spring cloud applications presents use of spring cloud zuul with eureka discovery service.

### Run
Run zuul-eureka, then eureka dashboard should be available at http://localhost:8761
Run zuul-service-report, zuul-service-user, zuul-gateway then services will register in server and should be visible on eureka dashboard

zuul-service-report works at port 1111
zuul-service-user works at port 2222
zuul-gateway works at port 8080

Now you can hit http://localhost:8080/user or http://localhost:8080/report and gateway will give you content of specified services.
