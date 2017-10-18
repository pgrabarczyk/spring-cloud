package com.pgrabarczyk.spring.cloud.sleuth.scheduler.service;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LogService {

	private DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
	private Random r = new Random();

	@Scheduled(initialDelay = 1000, fixedDelay = 1000)
	public void logCurrentDateTime() {
		ZonedDateTime now = ZonedDateTime.now();
		String dateTimeFormatted = dtf.format(now);
		log.debug("Hello! Current date/time is {}", dateTimeFormatted);
		
		if(r.nextBoolean()) {
			log.debug("Hello second time!");
			if(r.nextBoolean()) {
				log.debug("Lucky! Hello third time!");
			}
		}
	}
}
