package com.pgrabarczyk.spring.sleuth.cloudwatch.controller;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController("/")
@Slf4j
public class SampleController {

	private AtomicInteger getRequestCounter = new AtomicInteger(0);

	@GetMapping
	@ResponseBody
	public int get() {
		final int counter = getRequestCounter.incrementAndGet();
		log.info("Actually we had {} HTTP.GET requests", counter);
		return counter;
	}

	@ExceptionHandler(Exception.class)
	public String handleException(Exception ex) {
		log.error(ex.getMessage());
		return ex.getMessage();
	}

}
