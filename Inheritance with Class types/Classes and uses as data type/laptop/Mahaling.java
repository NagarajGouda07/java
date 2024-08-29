package com.xworkz.laptop;

public class Mahaling {
	
	
	public void use(Laptop laptop) {

		if (laptop != null) {
			laptop.rinse();
			laptop.show();
		} else {
			System.out.println("Laptop is null");
		}
	}

}
