package com.ecommerce.customer.dto;

import javax.validation.constraints.Size;

public class CustomerDto {

	@Size(min = 3, max = 15, message = "First name should have 3-15 characters")
	private String firstName;

	@Size(min = 3, max = 15, message = "Last name should have 3-15 characters")
	private String lastName;

	private String username;
	private String phoneNumber;
	private String address;
	private String city;
	private String country;
	@Size(min = 5, max = 20, message = "Password should have 5-20 characters")
	private String password;

	private String repeatPassword;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepeatPassword() {
		return repeatPassword;
	}

	public void setRepeatPassword(String repeatPassword) {
		this.repeatPassword = repeatPassword;
	}

	public CustomerDto(@Size(min = 3, max = 15, message = "First name should have 3-15 characters") String firstName,
			@Size(min = 3, max = 15, message = "Last name should have 3-15 characters") String lastName,
			String username, String phoneNumber, String address, String city, String country,
			@Size(min = 5, max = 20, message = "Password should have 5-20 characters") String password,
			String repeatPassword) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.city = city;
		this.country = country;
		this.password = password;
		this.repeatPassword = repeatPassword;
	}

	public CustomerDto() {

	}
	
	
	
}
