package com.amazon.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.beans.Cart;
import com.amazon.beans.Product;
import com.amazon.beans.User;
import com.amazon.service.CartService;
import com.amazon.service.ProductService;
import com.amazon.service.UserService;

@RestController
public class ProductController {
	
	
	@Autowired
	ProductService p1;
	
	@Autowired
	UserService us;
	
	@Autowired
	CartService cs;
	
	@RequestMapping("/products")
	public  List<Product> getProducts(){
		return p1.getProductDetails();
	}
	
	@RequestMapping("/productByPC/{category}")
	public  List<Product> getProductsSpecificCategory(@PathVariable String category){
		return p1.getProductsSpecificCategory(category);
	}
	
	@RequestMapping("/productByUC/{category}")
	public  List<Product> getUserSpecificCategory(@PathVariable String category){
		return p1.getUserSpecificCategory(category);
	}
	
	@RequestMapping("/productByMaxMin/{max}/{min}")
	public  List<Product> getproductsBewtweenMaxMinPrice(@PathVariable Double max, @PathVariable Double min){
		return p1.getproductsBewtweenMaxMinPrice(max,min);
	}
	


	
	@RequestMapping("/users")
	public  List<User> getUsers() {
		
		return us.getUserS();
	}
	
	@GetMapping("/cart/{userID}")
	public Cart getCart(@PathVariable Integer userID) {
		return cs.viewCartForUser(userID);
		
	}
	
}
