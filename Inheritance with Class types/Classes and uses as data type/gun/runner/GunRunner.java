package com.xworkz.gun.runner;

import com.xworkz.gun.Dboss;

import com.xworkz.gun.Godse;
import com.xworkz.gun.Gun;
import com.xworkz.gun.Police;
import com.xworkz.gun.Soldier;

public class GunRunner {

	public static void main(String[] args) {

		Soldier soldier = new Soldier();
		soldier.gun();

		Police police = new Police();
		Gun gun = new Gun("J-22", "India", "pistols");
		police.use(gun);

		Gun gun1 = new Gun("MI895", "India", "Revolver");
		Dboss dboss = new Dboss(gun1);

		dboss.fire();

		Godse godse = new Godse();
		Gun ref = godse.use();
		if (ref != null) {
			ref.fire();
			ref.display();
		}

	}

}
