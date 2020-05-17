package com.amazon.serviceI.mpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.beans.Product;
import com.amazon.beans.User;
import com.amazon.dao.UserDAO;
import com.amazon.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserDAO u1;
	
	@Override
	public  List<User> getUserS() {
		return u1.getListRegisteredUser().stream().collect(Collectors.toList());
	}

}
