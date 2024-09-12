package com.xworkz.example;

public class Person {

	// variable declaration
	String name;
	String email;
	int age;
	String mobileNo;

	// Constructor to initialize Person objects
	public Person(String name, String email, int age, String mobileNo) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.mobileNo = mobileNo;
	}

	// Method to print details of the Person
	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Age: " + age);
		System.out.println("Mobile No: " + mobileNo);
		System.out.println("---------------------");
	}
}
