package com.xworkz.parentclass.inheritence;

public class CentralGovernment extends Government {

	public CentralGovernment(String state, int noOfMlas) {
		super(state, noOfMlas);
		System.out.println("Creating a Central Governemt with String and int");
	}

}
