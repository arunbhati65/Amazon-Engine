package com.amazon.dao.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.amazon.beans.Product;
import com.amazon.dao.ProductDAO;
import com.amazon.enums.ProductCategory;
import com.amazon.enums.UserCategory;
@Repository
public class ProductDAOImpl implements ProductDAO{

	private List<Product> products=null;
	
	@Override
	public List<Product> getProducts()  {
	 List<Product> products=new ArrayList<Product>();
	 

	 Product product1=new Product(101,"American Tourister ver 1.0",ProductCategory.BAG, UserCategory.NEUTRAL, 7005.5, 1);
	 Product product2=new Product(102,"Denim 1",ProductCategory.CLOTHS, UserCategory.MEN, 2000, 1);
	 Product product3=new Product(103,"Denim 2",ProductCategory.CLOTHS, UserCategory.WOMEN, 1500.5, 1);
	 Product product4=new Product(104,"Puma ver 5",ProductCategory.SPORT, UserCategory.MEN, 3000.5, 1);
	 Product product5=new Product(104,"Addidas ver 3",ProductCategory.SPORT, UserCategory.WOMEN, 4000.5, 1);

	products.add(product5);
	products.add(product1);
	products.add(product2);
	products.add(product3);
	products.add(product4);

	return products;
  }

	@Override
	public void setProducts(List<Product> products) {
		this.products=products;
		
	}

	@Override
	public List<Product> getProductsSpecificCategory(List<Product> products,String pc) {
		return products.stream().filter(p->p.getPc().getName().equals(pc)).collect(Collectors.toList());
	}
	
	@Override
	public List<Product> getUserSpecificCategory(List<Product> products,String uc) {
		return products.stream().filter(p->p.getUc().getName().equals(uc)).collect(Collectors.toList());
	}
	@Override
	public List<Product> getproductsBewtweenMaxMinPrice(List<Product> products,Double max,Double min){
		return products.stream().filter(p->p.getPrice()<=max).filter(p->p.getPrice()>=min).collect(Collectors.toList());
		
	}

}
