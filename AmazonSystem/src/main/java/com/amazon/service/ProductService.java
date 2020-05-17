package com.amazon.service;

import java.util.List;

import com.amazon.beans.Product;
import com.amazon.enums.ProductCategory;

public interface ProductService {
	public List<Product> getProductDetails();
	public  List<Product> getProductsSpecificCategory(String pc);
	public  List<Product> getUserSpecificCategory(String uc);
	public  List<Product> getproductsBewtweenMaxMinPrice(Double max,Double min);
}
