package com.xworkz.demo;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = new String(" HELLO NAGARAJ GOUDA");
		String s2 = " Nagaraj Gouda WellCome To Java Programm";

		System.out.println(s1);
		System.out.println(s2);

		// String total length
		System.out.println(s1.length());
		System.out.println(s2.length());

		// String char index length
		System.out.println(s1.charAt(7));
		System.out.println(s2.charAt(32));

		// String substring 0-5 this two b/w letters display
		System.out.println(s1.substring(0, 6));
		System.out.println(s1.substring(7, 20));

		// String s1 + s2, concat in two String
		System.out.println(s1.concat(s2));
		System.out.println(s2.concat(s1));
		System.out.println("--------------");

		System.out.println(s1 + ", " + s2 + "!");
		System.out.println(s2 + ", " + s1 + "!");

		// String equals

		String s3 = new String("HELLO");
		String s4 = "Hello";

		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));

		// String lower and upper case
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toUpperCase());

		// string trim
		String s5 = "  Hello, World!  ";
		System.out.println(s5.trim());

		// String replace
		String s6 = "java is a good for";
		System.out.println(s6.replace("for", "language for deveploment;"));

		String s7 = "Apple,Banana,orange,Graps";
		String[] fruits = s7.split(",");
		System.out.println(fruits);

	}

}
