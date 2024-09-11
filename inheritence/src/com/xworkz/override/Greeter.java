package com.xworkz.override;

class Greeter {
	
	// overloading
	public void greet(String firstName) {
		System.out.println(firstName);
	}

	public void greet(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}

	public void greet(String title, String firstName, String lastName) {
		System.out.println("Hello, " + title + " " + firstName + " " + lastName);
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();

		greeter.greet("John");

		greeter.greet("John", "Doe");

		greeter.greet("Mr.", "John", "Doe");
	}
}
