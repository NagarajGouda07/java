package com.xworkz.casting.internal;

public class Runner {

	public static void main(String[] args) {

		Belt belt = new Belt();
		belt.tie();

		System.out.println("-------------");
		LeatherBalt leatherBalt = new LeatherBalt();
		leatherBalt.clip();

		Dancer dancer = new Dancer();
		dancer.use(leatherBalt);
		System.out.println("--------------");

	}

}
