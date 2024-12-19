package com.xworkz.map;

import java.util.*;

public class Sateesh {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();

		al.add("Nagaraj");
		al.add("Rajesh");
		al.add("Mahaling");
		al.add("yash");

		al.add(2, "Ravitej...");

		al.remove("Ravitej...");

		System.out.println(al.contains("Nagaraj"));

		for (String s : al) {
			System.out.println(s);
		}
		System.out.println("  ");

	}

}
