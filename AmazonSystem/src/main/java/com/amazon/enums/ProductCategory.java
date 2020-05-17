package com.amazon.enums;

public enum ProductCategory {
	BAG("Bag"), SPORT("Sport"), CLOTHS("Cloths");
	
	
    private String name;
    
    
	ProductCategory(String name){
	        this.name = name;
	    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
