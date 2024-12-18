package com.xwrokz.logical.fibonacciseries;

import java.util.Scanner;

public class FibonacciSeries01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of terms for the Fibonacci series:  ");
		int n = scanner.nextInt();

		scanner.close();
		if (n <= 0) {

		} else {
			int n1 = 0, n2 = 1;
			System.out.println("Fibonacci Series up to " + n + " terms:");

			for (int i = 1; i < n; i++) {
				System.out.print(n1+" ");
				int sum = n1 + n2;
				n1 = n2;
				n2 = sum;
			}
		}

	}
}
