package com.pgrabarczyk.spring.cloud.zuul.service.report;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReportController {

	@RequestMapping
	public String getReport() {
		return "report";
	}

}
