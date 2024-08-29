package com.xworkz.washingmachine;

public class Lakshmi {

	public void use(WashingMachine washingMachine) {

		if (washingMachine != null) {
			washingMachine.rinse();
			washingMachine.show();
		} else {
			System.out.println("WashingMachine is null");
		}
	}

}
