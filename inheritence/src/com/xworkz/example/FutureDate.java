package com.xworkz.example;

import java.time.LocalDate;

public class FutureDate {

	public static void main(String[] args) {

		// Current date
		LocalDate currentDate = LocalDate.now();

		// Create a date 5 months in the future
		LocalDate futureDate = currentDate.plusMonths(10);

		System.out.println("Current Date: " + currentDate);
		System.out.println("Future Date: " + futureDate);
	}
}
