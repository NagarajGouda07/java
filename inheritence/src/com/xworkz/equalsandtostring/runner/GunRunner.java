package com.xworkz.equalsandtostring.runner;

import com.xworkz.equalsandtostring.Gun;

public class GunRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gun gun = new Gun("AK47", "Pi", 1.5, "India", "6", 2);

		Gun gun2 = new Gun("AK47", "Pi", 2.5, "India", "6", 1);

		boolean same = gun.equals(gun2);
		System.out.println("Gun and Gun2 is:" + gun);
	}

}
