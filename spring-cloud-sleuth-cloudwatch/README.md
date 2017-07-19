# spring-cloud-sleuth-cloudwatch
Spring cloud application loggin onto console, file and AWS CloudWatch using spring-cloud-sleuth.

### The problem
Currently AWS SDK for java give us appender for log4j.

spring-cloud-sleuth works for slf4j (logback).

### The solution
Solution is to use [CloudWatch Appender](https://github.com/trautonen/logback-ext/tree/master/logback-ext-cloudwatch-appender)

Big thanks to [Tapio Rautonen](https://github.com/trautonen)

### To make app work and log into cloudwatch
Create log group and log stream onto AWS CloudWatch and change their names

```
com.pgrabarczyk.spring.sleuth.cloudwatch.log.group=TODO_LOG_GROUP
com.pgrabarczyk.spring.sleuth.cloudwatch.log.stream=TODO_LOG_STREAM
```
in properties file:

```
src/main/resources/application.properties
```



### If not works
Check IAM roles as mentioned in [CloudWatch Appender](https://github.com/trautonen/logback-ext/tree/master/logback-ext-cloudwatch-appender)

EC2 where I ran this app had policy:
```
{
  "Version": "2012-10-17",
  "Statement": [
    {
      "Effect": "Allow",
      "Action": [
        "logs:DescribeLogGroups",
        "logs:DescribeLogStreams",
        "logs:PutLogEvents"
    ],
      "Resource": [
        "arn:aws:logs:*:*:*"
    ]
  }
 ]
}
```
