package com.xworkz.chaining2;

class Animal {
	Animal() {
		System.out.println("Animal constructor called");
	}
}

class Mammal extends Animal {
	Mammal() {
		super(); // Calls the constructor of Animal
		System.out.println("Mammal constructor called");
	}
}

class Dog extends Mammal {
	Dog() {
		super(); // Calls the constructor of Mammal
		System.out.println("Dog constructor called");
	}

	public static void main(String[] args) {
		Dog dog = new Dog(); // This will call constructors in the following order: Animal -> Mammal -> Dog
	}
}
