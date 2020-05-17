package com.amazon.dao;

import java.util.List;

import com.amazon.beans.Cart;

public interface CartDAO {
	public void setUserCart(Cart userCart);
	List<Cart> getCarts();
	
}
