package com.xworkz.equalsandtostring.runner;

import com.xworkz.equalsandtostring.Saree;

public class SareeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Saree saree1 = new Saree("reshme ", "Silk", 890, "White", "5%", "Sourbh");

		Saree saree2 = new Saree("reshme", "Silk", 890, "Yellow", "5%", "Moltira");

		boolean equal = saree1.equals(saree2);
		System.out.println("Saree1 and Saree2 is :" + equal);
	}

}
