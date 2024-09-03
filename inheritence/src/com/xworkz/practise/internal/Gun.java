package com.xworkz.practise.internal;

public class Gun extends Weapon {

	@Override
	protected void use() {
		System.out.println("Using weapon");
	}

	@Override
	public void fire() {
		System.out.println("Firing weapon");
	}

	public void nodu() {
		use();
		fire();
	}

}
