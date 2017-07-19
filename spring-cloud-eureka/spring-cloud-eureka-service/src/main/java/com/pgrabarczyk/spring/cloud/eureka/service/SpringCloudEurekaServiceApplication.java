package com.pgrabarczyk.spring.cloud.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServiceApplication.class, args);
	}
}
