package com.xworkz.internal.DTO;

import com.xworkz.internal.ProductType;

public class CustomerDTO {

	private String name;
	private String email;
	private ProductType productType;

	public CustomerDTO(String name, String email, ProductType productType) {
		this.name = name;
		this.email = email;
		this.productType = productType;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void displayCustomerDTO() {
		System.out.println("Customer Name :: " + getName());
		System.out.println("Customer Email :: " + getEmail());
		System.out.println("Customer ProductType :: " + getProductType());
	}

}