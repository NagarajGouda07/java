package com.xworkz.laptop;

public class Laptop {

	private String brand;
	private String color;
	private int size;

	public Laptop() {
		System.out.println("running Laptop");
	}

	public Laptop(String brand, String color, int size) {
		super();
		this.brand = brand;
		this.size = size;
		this.color = color;
	}

	public void rinse() {
		System.out.println("------------");
	}

	public void show() {
		System.out.println("Brand :" + brand);
		System.out.println("Color :" + color);
		System.out.println("Size :" + size);
	}

}
