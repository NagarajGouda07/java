package com.xworkz.practise.external;

import com.xworkz.practise.internal.Weapon;

public class MachineGun extends Weapon {

	@Override
	protected void use() {
		System.out.println("Using weapon");
	}

	@Override
	public void fire() {
		System.out.println("Firing weapon");
	}

	public void show() {
		use();
		fire();
	}

}
