package com.xworkz.equalsandtostring.runner;

import com.xworkz.equalsandtostring.Jeans;

public class JeansRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jeans jeans1 = new Jeans("Levis", "Blue", "32", 59.99, "Denim", false);
        Jeans jeans2 = new Jeans("Levis", "Blue", "32", 65.00, "Denim", true);


		boolean same = jeans1.equals(jeans2);
		System.out.println("Jeans1 and Jeans2 is :" + same);// false

	}

}
