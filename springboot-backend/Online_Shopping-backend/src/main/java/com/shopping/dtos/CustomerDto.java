package com.shopping.dtos;

public class CustomerDto {
	private int id;
	private String name;
	private String email;
	private String addressText;
	private int pinCode;
	
	public CustomerDto() {
	}
	
	public CustomerDto(int id, String name, String email, String addressText, int pinCode) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.addressText = addressText;
		this.pinCode = pinCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddressText() {
		return addressText;
	}

	public void setAddressText(String addressText) {
		this.addressText = addressText;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
