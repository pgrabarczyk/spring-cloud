package com.pgrabarczyk.spring.cloud.config.client.report;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ReportController {

	@Value("${db.user}")
	private String dbUser;

	@Value("${db.password}")
	private String dbPassword;

	@RequestMapping
	public String getUserAndPassword() {
		return String.format("For report user is \"%s\" and password is \"%s\"", dbUser, dbPassword);
	}

}
