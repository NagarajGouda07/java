package com.xworkz.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {

		// Specify the path of the file
		String filePath = "output.txt"; // Replace with the path of your file

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			// Write name, email, and mobile number to the file
			writer.write("Name: John Doe");
			writer.newLine(); // Insert a new line
			writer.write("Email: john.doe@example.com");
			writer.newLine(); // Insert a new line
			writer.write("Mobile: 123-456-7890");

			System.out.println("Details have been written to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}
	}
}
