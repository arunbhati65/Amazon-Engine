package com.amazon.dao.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazon.beans.Cart;
import com.amazon.dao.CartDAO;
@Repository
public class CartDAOImpl implements CartDAO {
	@Autowired
	ProductDAOImpl productDAOImpl;
	
	@Autowired
	UserDAOImpl userDAOImpl;
	
	@Override
	public List<Cart> getCarts() {
		
		List<Cart> carts=new ArrayList<Cart>();
		
		
		
		
		carts.add(new Cart(11817,
				productDAOImpl.getproductsBewtweenMaxMinPrice(productDAOImpl.getProducts(), 4000.0, 200.0)
				.stream().map(p->p.getId()).collect(Collectors.toList())));
		carts.add(new Cart(userDAOImpl.getListRegisteredUser().get(1).getId(),
				productDAOImpl.getproductsBewtweenMaxMinPrice(productDAOImpl.getProducts(), 8000.0, 400.0)
				.stream().map(p->p.getId()).collect(Collectors.toList())));
		
		return carts;
	}

	@Override
	public void setUserCart(Cart userCart) {
		
	}

}
