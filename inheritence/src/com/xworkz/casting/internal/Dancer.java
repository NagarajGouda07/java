package com.xworkz.casting.internal;

public class Dancer {
	public void use(Belt belt) {
		System.out.println("***********");
		Belt ref = new Belt();
		ref.tie();

		if (belt instanceof LeatherBalt) {
			System.out.println("instance of LeatherBalt");
			LeatherBalt leatherBalt = (LeatherBalt) belt;
			leatherBalt.tie();
			leatherBalt.clip();
		}
		else {
			System.out.println("777777777");
		}

	}

}
