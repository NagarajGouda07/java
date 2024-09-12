package com.xworkz.example;

import java.time.LocalDateTime;

public class FutureDateTime {

	public static void main(String[] args) {

		// Current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();

		// Create a datetime 3 months and 1 day in the future
		LocalDateTime futureDateTime = currentDateTime.plusMonths(3).plusDays(1);

		System.out.println("Current DateTime: " + currentDateTime);
		System.out.println("Future DateTime: " + futureDateTime);
	}
}
