package com.amazon.dao.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.amazon.beans.Product;
import com.amazon.beans.User;
import com.amazon.dao.UserDAO;
import com.amazon.enums.ProductCategory;

@Repository
public class UserDAOImpl implements UserDAO{

	@Override
	public List<User> getListRegisteredUser() {
		
		User u1=new User(027051, "Arun", "VimanNagar1", "9176327608");
		User u2=new User(027052, "Varun", "VimanNagar2", "9176327608");
		User u3=new User(027053, "Tarun", "VimanNagar3", "9176327608");
		
		List<User> users=new ArrayList<User>();
		users.add(u1);
		users.add(u2);
		users.add(u3);
		
		return users;
	}
}
