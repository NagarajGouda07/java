package com.xworkz.internal;

public class Demo {

	private String name;
	private int id;
	private String addrees;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddrees() {
		return addrees;
	}

	public void setAdderes(String addrees) {
		this.addrees = addrees;
	}

	public void displayInfo() {
		System.out.println("Name :" + name);
		System.out.println("Id :" + id);
		System.out.println("Addrees :" + addrees);
	}

}
