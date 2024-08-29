package com.xworkz.laptop.runner;

import com.xworkz.laptop.Laptop;
import com.xworkz.laptop.Mahaling;
import com.xworkz.laptop.Pooja;
import com.xworkz.laptop.Rajesh;
import com.xworkz.laptop.Uma;

public class LaptopRunner {

	public static void main(String[] args) {

		Rajesh rajesh = new Rajesh();
		rajesh.Laptop();

		Mahaling mahaling = new Mahaling();
		Laptop laptop = new Laptop("acces", "silver", 8);
		mahaling.use(laptop);

		Laptop laptop1 = new Laptop("Samsung", "red", 7);
		Pooja pooja = new Pooja(laptop1);

		pooja.fire();

		Uma uma = new Uma();
		Laptop ref = uma.use();
		if (ref != null) {
			ref.rinse();
			ref.show();
		}

	}

}
