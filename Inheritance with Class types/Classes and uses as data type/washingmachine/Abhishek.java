package com.xworkz.washingmachine;

public class Abhishek {

	private WashingMachine washingMachine;

	public Abhishek(WashingMachine washingMachine) {
		this.washingMachine = washingMachine;
	}

	public void fire() {
		if (washingMachine != null) {
			washingMachine.rinse();
			washingMachine.show();
		} else {
			System.out.println("WashingMachine is null");
		}
	}

}