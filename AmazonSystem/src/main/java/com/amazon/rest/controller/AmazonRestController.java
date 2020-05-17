package com.amazon.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmazonRestController {

	@RequestMapping("/hello")
	public String welcomeUser() {
		return "welcome to Aamzon ,15% off!!!! winter Season !!!";
	}
}
