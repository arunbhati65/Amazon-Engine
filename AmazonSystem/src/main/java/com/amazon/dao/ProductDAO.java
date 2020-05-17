package com.amazon.dao;

import java.util.List;

import com.amazon.beans.Product;
import com.amazon.enums.ProductCategory;
import com.amazon.enums.UserCategory;

public interface ProductDAO {
	


	public List<Product> getProducts();
	public void setProducts(List<Product> products);
	public List<Product> getProductsSpecificCategory(List<Product> products,String pc);
	List<Product> getproductsBewtweenMaxMinPrice(List<Product> products,Double max, Double min);
	List<Product> getUserSpecificCategory(List<Product> products,String uc);
	
	
	
}
