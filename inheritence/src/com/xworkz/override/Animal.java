package com.xworkz.override;

public class Animal {

	void sound() {
		System.out.println("Some sound");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Bark");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("Meow");
	}

	public static void main(String[] args) {
		Animal a = new Animal();
		a = new Dog();
		a.sound();

		a = new Cat();
		a.sound();

	}

}
