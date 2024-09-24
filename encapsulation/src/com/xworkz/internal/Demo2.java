package com.xworkz.internal;

public class Demo2 {

	public static void main(String[] args) {

		Demo d1 = new Demo();
		
		//this is no access specifiers do this methods
		//System.out.println(d1.name);
		//System.out.println(d1.id);
		//System.out.println(d1.addrees);
		
		// I will access specifiers manition in instances variables do this methods
		d1.setName("Nagaraj Gouda");
		d1.setId(13);
		d1.setAdderes("Agasaladinne");
		d1.displayInfo();

	}

}
