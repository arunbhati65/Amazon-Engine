package com.amazon.rest.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		
		
		ProductController productController=context.getBean(ProductController.class);
		/*productController.getProducts();
		System.out.println("++++++++++++++a");
		productController.getUsers();
		System.out.println("++++++++++++++b");*/
		//productController.getCart(11817);
		
		
	}

}








