package com.pgrabarczyk.spring.cloud.zuul.service.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping
	public String getUser() {
		return "user";
	}

}