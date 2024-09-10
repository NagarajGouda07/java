package com.xworkz.equalsandtostring.runner;

import com.xworkz.equalsandtostring.Bedsheet;

public class BedsheetRunner {

	public static void main(String[] args) {

		Bedsheet bedsheet = new Bedsheet("Cotton", "Pink", 150, 'S', 2, 550);

		Bedsheet bedsheet1 = new Bedsheet("Cotton", "Pink", 150, 'S', 2, 550);

		boolean comapre = bedsheet.equals(bedsheet1);
		System.out.println("Bed sheet and bed sheet2 is" + comapre);

	}

}
