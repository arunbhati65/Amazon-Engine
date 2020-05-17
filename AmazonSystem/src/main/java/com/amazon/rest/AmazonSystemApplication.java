package com.amazon.rest;

import org.springframework.boot.SpringApplication;//bootstrap your pring boot application
//creates application context,register all beans
//starts embedeed server tomcart
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


//@ComponentScan //@EnableautoConfiguration // @Configuration
@SpringBootApplication //Enable:
@ComponentScan(basePackages="com")
public class AmazonSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonSystemApplication.class, args);
	}

}
