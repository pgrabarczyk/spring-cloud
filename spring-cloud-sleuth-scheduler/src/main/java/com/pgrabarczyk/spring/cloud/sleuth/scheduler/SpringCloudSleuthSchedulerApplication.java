package com.pgrabarczyk.spring.cloud.sleuth.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringCloudSleuthSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSleuthSchedulerApplication.class, args);
	}
}
