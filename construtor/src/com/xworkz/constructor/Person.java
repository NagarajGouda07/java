package com.xworkz.constructor;

public class Person {

	    String name;
	    int age;
	    
	    //this chaining constructor
	    /*Person() {
	    	this("Naga", 23);
	    }*/

	    // No-argument constructor
	    Person() {
	        name = "rajesh";
	        age = 24;
	    }

	    // Parameterized constructor
	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public static void main(String[] args) {
	        Person person1 = new Person();               // Calls no-argument constructor
	        Person person2 = new Person("Raj", 30);     // Calls parameterized constructor

	        System.out.println("Person 1: " + person1.name + ", Age: " + person1.age); // Output: Unknown, 0
	        System.out.println("Person 2: " + person2.name + ", Age: " + person2.age); // Output: John, 30
	    }
	}