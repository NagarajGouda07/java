package com.xwrokz.logical.swapping;

import java.util.Scanner;

public class SwappingUsingClient {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int a = sc.nextInt();
		System.out.println("Enter num2");
		int b = sc.nextInt();

		System.out.println("Before Swapping...");
		System.out.println("a = " + a + " b = " + b);

		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("Before Swapping...");
		System.out.println("a = " + a + " b = " + b);

	}

}
