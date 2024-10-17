package com.xworkz.finalkeyword;

public class Vehicle {
	
	    public final void start() {
	        System.out.println("Vehicle is starting...");
	    }
	}

	class Car extends Vehicle {
	    // This will cause a compile-time error
	    public void start() {  // Error Cannot override the final method from Vehicle
	        System.out.println("Car is starting...");
	    }


	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		vehicle.start();
		
	}

}
