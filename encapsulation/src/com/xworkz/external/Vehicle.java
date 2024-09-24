package com.xworkz.external;

//Abstract class with partial abstraction

abstract class Vehicle {

	// Abstract method (no implementation)
	abstract void startEngine();

	// Concrete method (full implementation)
	void fuelUp() {
		System.out.println("Filling up the fuel tank.");
	}
}
