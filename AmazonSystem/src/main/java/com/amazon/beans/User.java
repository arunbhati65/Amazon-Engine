package com.amazon.beans;

public class User {
	private int Id;
	private String name;
	private String address;
	private String phoneNumber;
	public User() {

	}
	public User(int id, String name, String address, String phoneNumber) {
		Id = id;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
	
}
