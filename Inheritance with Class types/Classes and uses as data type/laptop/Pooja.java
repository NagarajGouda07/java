package com.xworkz.laptop;

public class Pooja {

	private Laptop laptop;

	public Pooja(Laptop laptop) {
		this.laptop = laptop;
	}

	public void fire() {
		if (laptop != null) {
			laptop.rinse();
			laptop.show();
		} else {
			System.out.println("Laptop is null");
		}
	}

}
