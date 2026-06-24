package com.myhr;

import org.springframework.stereotype.Component;

@Component
public class Address {
	String homeNumber = "B378";
	String street = "New Colony";
	String city = "Ghazibad";
	String country = "India";

	public String getHomeNumber() {
		return homeNumber;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}
}
