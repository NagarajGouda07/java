package com.xworkz.parentclass.inheritence;

public class ToothBrush {

	private String company;
	private double price;

	public ToothBrush(String company, double price) {
		this.company = company;
		this.price = price;

	}

	public void display() {
		System.out.println("Company:" + this.company);
		System.out.println("Price :" + this.price);
	}

}
