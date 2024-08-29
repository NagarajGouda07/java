package com.xworkz.gun;

public class Police {

	public void use(Gun gun) {

		if (gun != null) {
			gun.fire();
			gun.display();
		} else {
			System.out.println("Gun is null");
		}
	}

}
