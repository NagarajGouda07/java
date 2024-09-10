package com.xworkz.equalsandtostring.runner;

import com.xworkz.equalsandtostring.Grinder;

public class GrinderRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grinder grinder1 = new Grinder("Crompton", 1840, "ACGM-DS500W3J", 2, "Black", 2);

		Grinder grinder2 = new Grinder("Crompton", 1840, " ACGM-AMEO", 1, "White", 2);

		boolean compare = grinder1.equals(grinder2);
		System.out.println("Grinder 1 and Grinder2 is : " + compare);
	}

}
