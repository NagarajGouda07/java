package com.xworkz.external;

public class Car extends Vehicle {

	// Providing implementation for the abstract method
	@Override
	void startEngine() {
		System.out.println("Starting car engine.");
	}

	public static void main(String[] args) {
		Vehicle car = new Car();
		car.startEngine(); // Calls the concrete implementation from the Car class
		car.fuelUp(); // Calls the concrete method from the abstract class
	}
}
//Abstract class with partial abstraction
