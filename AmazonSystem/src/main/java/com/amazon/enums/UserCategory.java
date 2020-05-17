package com.amazon.enums;

public enum UserCategory {
	KID("Kid"), MEN("Men"), WOMEN("Women"), NEUTRAL("Neutral");
	
	
    private String name;
    
    
    UserCategory(String name){
	        this.name = name;
	    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
