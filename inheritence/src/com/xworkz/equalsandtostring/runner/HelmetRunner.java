package com.xworkz.equalsandtostring.runner;

import com.xworkz.equalsandtostring.Helmet;

public class HelmetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Helmet helmet = new Helmet("RGV", 'M', "Black", 6000, 2, "ChapMoto");

		Helmet helmet2 = new Helmet("RGV", 'S', "green", 5500, 2, "RevZilla");

		boolean same = helmet.equals(helmet2);
		System.out.println("Helmet and helmet2 is " + same);
	}

}
