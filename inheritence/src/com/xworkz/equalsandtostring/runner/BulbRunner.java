package com.xworkz.equalsandtostring.runner;

import com.xworkz.equalsandtostring.Bulb;

public class BulbRunner {

	public static void main(String[] args) {

		Bulb bulb = new Bulb("gvw", 18, "red", "Led", 189, "SuperComNet");

		Bulb bulb2 = new Bulb("gvw", 20, "red", "Led", 189, "SuperCom");

		boolean same = bulb.equals(bulb2);
		System.out.println("Bulb And Bulb2 is:" + same);
	}

}
