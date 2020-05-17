package com.amazon.beans;

import java.util.List;
import java.util.stream.Collectors;


public class Cart {
	private int userID;
	private List<Integer> productsInCart;
	private Double toatlPrice;
	
	public Cart(int userID, List<Integer> productsInCart) {
		super();
		this.userID = userID;
		this.productsInCart = productsInCart;
	}
	public int getUserID() {
		return userID;
	}
	@Override
	public String toString() {
		return "Cart [userID=" + userID + ", productsInCart=" + productsInCart
				+ ", toatlPrice=" + toatlPrice + "]";
	}
	public Double getToatlPrice() {
		return toatlPrice;
	}
	public void setToatlPrice(Double toatlPrice) {
		this.toatlPrice = toatlPrice;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public List<Integer> getProductsInCart() {
		return productsInCart;
	}
	public void setProductsInCart(List<Integer> productsInCart) {
		this.productsInCart = productsInCart;
	}
	/*public Double getToatlPrice() {
		return toatlPrice=this.productsInCart.stream().collect(Collectors.summingDouble(Product::getPrice));
	}*/
	
	
}
