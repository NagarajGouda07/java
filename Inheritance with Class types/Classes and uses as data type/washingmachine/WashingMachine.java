package com.xworkz.washingmachine;

public class WashingMachine {

	private String brand;
	private String type;
	private int capacity;

	public WashingMachine() {
		System.out.println("running WashingMachine");
	}

	public WashingMachine(String brand, String type, int capacity) {
		super();
		this.brand = brand;
		this.type = type;
		this.capacity = capacity;
	}

	public void rinse() {
		System.out.println("------------");
	}

	public void show() {
		System.out.println("Brand :" + brand);
		System.out.println("Type :" + type);
		System.out.println("Capacity :" + capacity);
	}

}
