# spring-cloud-sleuth-scheduler
Spring cloud application loggin onto console and file with spring-cloud-sleuth using scheduler.

Application loggin date time, randomly second and third "hello" to check sleuths parameters.
Could be used for generate logs for tools like ElasticSearch or Kibana.

Logs are in console and file in logs/spring-cloud-sleuth-scheduler.log


```
2017-10-18 19:17:50.535 DEBUG [bootstrap,63cbef41abfe1435,63cbef41abfe1435,false] 17772 --- [pool-2-thread-1] c.p.s.c.s.scheduler.service.LogService   : Hello! Current date/time is 2017-10-18T19:17:50.535
2017-10-18 19:17:51.536 DEBUG [bootstrap,e92266388a607daf,e92266388a607daf,false] 17772 --- [pool-2-thread-1] c.p.s.c.s.scheduler.service.LogService   : Hello! Current date/time is 2017-10-18T19:17:51.536
2017-10-18 19:17:52.536 DEBUG [bootstrap,8078f9b45da2a5f5,8078f9b45da2a5f5,false] 17772 --- [pool-2-thread-1] c.p.s.c.s.scheduler.service.LogService   : Hello! Current date/time is 2017-10-18T19:17:52.536
2017-10-18 19:17:52.537 DEBUG [bootstrap,8078f9b45da2a5f5,8078f9b45da2a5f5,false] 17772 --- [pool-2-thread-1] c.p.s.c.s.scheduler.service.LogService   : Hello second time!
2017-10-18 19:17:52.537 DEBUG [bootstrap,8078f9b45da2a5f5,8078f9b45da2a5f5,false] 17772 --- [pool-2-thread-1] c.p.s.c.s.scheduler.service.LogService   : Lucky! Hello third time!
```