package com.xworkz.equalsandtostring;

public class Jeans {
	private String brand; // instance variables
	private String color; // instance variables
	private String size;
	private double price;
	private String material;
	private boolean isRipped;

	// Constructor with parameters
	public Jeans(String brand, String color, String size, double price, String material, boolean isRipped) {
		super();
		this.brand = brand;
		this.color = color;
		this.size = size;
		this.price = price;
		this.material = material;
		this.isRipped = isRipped;
	}

	// over-ride the toString method
	@Override
	public String toString() {
		return "Jeans [brand=" + brand + ", color=" + color + ", size=" + size + ", price=" + price + ", material="
				+ material + ", isRipped=" + isRipped + "]";
	}

	// over-ride the equals method
	public boolean equals(Object obj) {
		System.out.println("Running a equals in Jeans");

		if (obj != null) {
			if (obj instanceof Jeans) {
				Jeans casted = (Jeans) obj; // casting
				if (this.brand.equals(casted.brand) && this.price == casted.price) {
					System.out.println("Equal");

				}
			} else {
				System.out.println("Obj is not a Jeans");
			}
		} else {
			System.out.println("Obj is null");
		}
		return super.equals(obj);
	}

}
