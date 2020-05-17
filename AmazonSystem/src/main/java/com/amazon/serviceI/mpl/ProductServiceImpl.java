package com.amazon.serviceI.mpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.beans.Product;
import com.amazon.dao.ProductDAO;
import com.amazon.enums.ProductCategory;
import com.amazon.enums.UserCategory;
import com.amazon.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDAO productDAO;
	@Override
	public  List<Product> getProductDetails() {
		return productDAO.getProducts().stream().collect(Collectors.toList());//forEach(System.out::println);
		
		
	}
	
	public   List<Product> getProductsSpecificCategory(String pc) {
		
		return productDAO.getProductsSpecificCategory(productDAO.getProducts(), 
				pc).stream().collect(Collectors.toList());//forEach(System.out::println);;
		
		
	}
	
	public  List<Product> getUserSpecificCategory(String uc) {
		
		return productDAO.getUserSpecificCategory(productDAO.getProducts(), uc).
		stream().collect(Collectors.toList());//forEach(System.out::println);
		
		
	}

	public  List<Product> getproductsBewtweenMaxMinPrice(Double max,Double min) {
		
		return productDAO.getproductsBewtweenMaxMinPrice(productDAO.getProducts(),max,min).stream()
				.collect(Collectors.toList());
		
		
	}

}
