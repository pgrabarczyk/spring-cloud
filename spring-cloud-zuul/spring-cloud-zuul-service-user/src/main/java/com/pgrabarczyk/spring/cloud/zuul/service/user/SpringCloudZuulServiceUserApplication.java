package com.pgrabarczyk.spring.cloud.zuul.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudZuulServiceUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulServiceUserApplication.class, args);
	}
}
