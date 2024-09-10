package com.xworkz.equalsandtostring;

public class Bedsheet {

	private String material; // instance variables
	private String color;
	private int threadCount;
	private char size;
	private int quantity;
	private double price;

	// Constructor with parameters
	public Bedsheet(String material, String color, int threadCount, char size, int quantity, double price) {
		super();
		this.material = material;
		this.color = color;
		this.threadCount = threadCount;
		this.size = size;
		this.quantity = quantity;
		this.price = price;
	}

	// over-ride the toString method
	@Override
	public String toString() {
		return "Bedsheet [material=" + material + ", color=" + color + ", threadCount=" + threadCount + ", size=" + size
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}

	// over-ride the equals method
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running a equals in Bedsheet");
		if (obj != null) {
			if (obj instanceof Bedsheet) {
				Bedsheet casted = (Bedsheet) obj; // casted
				if (this.material.equals(casted.material) && this.quantity == casted.quantity
						&& this.price == casted.price) {
					System.out.println("is Same");

				}
			} else {
				System.out.println("Obj is not BedSheet");
			}
		} else {
			System.out.println("Obj is Null");
		}
		return super.equals(obj);

	}
}
