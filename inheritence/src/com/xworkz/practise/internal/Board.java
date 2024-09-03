package com.xworkz.practise.internal;

public class Board {

	private String name;
	private String type;

	protected Board() {
		System.out.println("***********************");
	}

	public Board(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public void display() {
		System.out.println("Board Name :" + name);
		System.out.println("Board Type :" + type);
	}

}
