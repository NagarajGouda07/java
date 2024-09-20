package com.xworkz.tostring;

public class ToString {

	public static void main(String[] args) {

		Student n = new Student("Naga", "Gouda");
		System.out.println(n);
	}

}

class Student {

	private String firstName;
	private String lastName;

	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
