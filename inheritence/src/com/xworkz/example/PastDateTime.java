package com.xworkz.example;

import java.time.LocalDateTime;

public class PastDateTime {

	public static void main(String[] args) {

		// Current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();

		// Create a datetime 5 years and 2 hours in the past
		LocalDateTime pastDateTime = currentDateTime.minusYears(5).minusHours(2);

		System.out.println("Current DateTime: " + currentDateTime);
		System.out.println("Past DateTime: " + pastDateTime);
	}
}
