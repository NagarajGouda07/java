package com.xworkz.gun;

public class Gun {

	private String name;
	private String countryMade;
	private String type;

	public Gun() {
		System.out.println("------------");
	}

	public Gun(String name, String countryMade, String type) {
		super();
		this.name = name;
		this.countryMade = countryMade;
		this.type = type;
		System.out.println("create Gun using String, String and int const");
	}

	public void fire() {
		System.out.println("Running fire");
	}

	public void display() {
		System.out.println("Name :" + name);
		System.out.println("CountryMade :" + countryMade);
		System.out.println("Type :" + type);
	}
}
