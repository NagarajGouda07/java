package com.xworkz.practise.external;

import com.xworkz.practise.internal.Board;

public class CarromBoard extends Board {

	public CarromBoard() {
		super();
		System.out.println("created no-arg contructor in CarromBoard");
	}

	public CarromBoard(String name, String type) {
		super(name, type);
		System.out.println("created parameterized constructor in CarromBoard");
	}

}
