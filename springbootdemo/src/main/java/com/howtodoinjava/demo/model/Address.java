package com.howtodoinjava.demo.model;

public class Address {

	private String street;
	private String city;
	
	public Address() {}
	
	public Address(String s , String c) {
		street = s;
		city = c;		
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
}
