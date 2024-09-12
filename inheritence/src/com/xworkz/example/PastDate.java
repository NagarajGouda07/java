package com.xworkz.example;

import java.time.LocalDate;

public class PastDate {

	public static void main(String[] args) {
		// Current date
		LocalDate currentDate = LocalDate.now();

		// Create a date 10 years in the past
		LocalDate pastDate = currentDate.minusYears(20);

		System.out.println("Current Date: " + currentDate);
		System.out.println("Past Date: " + pastDate);
	}
}
