package com.amazon.serviceI.mpl;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.beans.Cart;
import com.amazon.dao.CartDAO;
import com.amazon.service.CartService;
@Service
public class CartServiceImpl implements CartService {
	@Autowired
	CartDAO cartDAO;
	
	public   Cart viewCartForUser(Integer UserID){
		return cartDAO.getCarts().stream().filter(c->c.getUserID()==UserID).collect(Collectors.toList()).get(0);
	}
}
