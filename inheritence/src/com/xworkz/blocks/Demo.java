package com.xworkz.blocks;

public class Demo {

	static int count;

	// Static block
	static {
		count = 10;
		System.out.println("Static block executed");
	}

	public static void main(String[] args) {
		System.out.println("Count: " + count);
	}
}
