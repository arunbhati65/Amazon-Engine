package com.amazon.beans;

import com.amazon.enums.ProductCategory;
import com.amazon.enums.UserCategory;

public class Product {
	private int id;
	private String name;
	private ProductCategory pc;
	private UserCategory uc;
	private double price;
	private int quantity;
	
	public Product() {
	}
	
	public Product(int id, String name, ProductCategory pc, UserCategory uc,
			double price, int quantity) {
		this.id = id;
		this.name = name;
		this.pc = pc;
		this.uc = uc;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", pc=" + pc + ", uc="
				+ uc + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProductCategory getPc() {
		return pc;
	}
	
	public void setPc(ProductCategory pc) {
		this.pc = pc;
	}
	public UserCategory getUc() {
		return uc;
	}
	public void setUc(UserCategory uc) {
		this.uc = uc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
