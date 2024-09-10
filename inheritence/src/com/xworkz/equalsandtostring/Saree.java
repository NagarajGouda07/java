package com.xworkz.equalsandtostring;

public class Saree {

	private String brand; // instance variables
	private String type;
	private double price;
	private String seller;
	private String offer;
	private String color;

	// Constructor with parameters
	public Saree(String brand, String type, double price, String color, String offer, String seller) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
		this.offer = offer;
		this.seller = seller;
	}

	// over-ride the toString method
	@Override
	public String toString() {
		return "Saree [brand=" + brand + ", type=" + type + ", price=" + price + ", color=" + color + ", offer=" + offer
				+ ", seller=" + seller + "]";
	}

	// over-ride the equals method
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running a euqals in Saree");

		if (obj != null) {
			if (obj instanceof Saree) {
				Saree casted = (Saree) obj; // casted
				if (this.type.equals(casted.type) && this.price == casted.price && this.offer.equals(casted.offer)) {
					System.out.println("is equal");

				}
			} else {
				System.out.println("Obj is Not a Saree");
			}
		} else {
			System.out.println("Obj is null");
		}
		return super.equals(obj);
	}
}
