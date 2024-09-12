package com.xworkz.example;

public class PersonRunner {

	public static void main(String[] args) {

		// Creating 5 copies of Person with different details
		Person person1 = new Person("John Doe", "john@example.com", 30, "1234567890");
		Person person2 = new Person("Jane Smith", "jane@example.com", 28, "2345678901");
		Person person3 = new Person("Emily Davis", "emily@example.com", 25, "3456789012");
		Person person4 = new Person("Michael Brown", "michael@example.com", 35, "4567890123");
		Person person5 = new Person("Olivia Johnson", "olivia@example.com", 29, "5678901234");

		// Creating an array to store these 5 Person objects
				Person[] personArray = { person1, person2, person3, person4, person5 };

				// Step 3: Use forEach to print all details of each Person
				for (Person person : personArray) {
					person.printDetails(); // Printing details of each person
				}
	}
}
