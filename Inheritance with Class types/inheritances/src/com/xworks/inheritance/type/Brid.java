package com.xworks.inheritance.type;

public class Brid {
	public String color;
	public double weight;
	public double height;
	public String breed;
	public String food;
	
	public Brid(){
		System.out.println("const in bird");
	}
	
	public void fly() {
		System.out.println("yes it can fly");
	}
	public void sound() {
		System.out.println("cluck");
	}
	public void food() {
		System.out.println("grains");
	}

}
