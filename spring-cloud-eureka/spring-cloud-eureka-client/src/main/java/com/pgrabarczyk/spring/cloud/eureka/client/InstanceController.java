package com.pgrabarczyk.spring.cloud.eureka.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

import lombok.extern.slf4j.Slf4j;

@RefreshScope
@RestController
@Slf4j
public class InstanceController {

	private static final String SERVICE_NAME = "eureka-service";
	
	@Autowired
	private EurekaClient eurekaClient;

	@RequestMapping
	public String callService() {
		InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka(SERVICE_NAME, false);
		String baseUrl = instanceInfo.getHomePageUrl();
		final String response = String.format("url for service: \"%s\" is \"%s\"", SERVICE_NAME, baseUrl);
		log.info(response);
		return response;
	}
}
