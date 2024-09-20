package com.xworkz.tostring;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		Course c1 = new Course("Java", "Good", 85);
		Course c2 = new Course("python", "better", 55);
		Course[] Courses = { c1, c2 };

		Person n = new Person("Naga", "Male", Courses);
		System.out.println(n);
	}
}

class Person {

	private String name;
	private String gender;
	private Course[] courses;

	public Person(String name, String gender, Course[] courses) {
		super();
		this.name = name;
		this.gender = gender;
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", course=" + Arrays.toString(courses) + "]";
	}

}

class Course {

	private String name;
	private String good;
	private int duration;

	public Course(String name, String good, int duration) {
		super();
		this.name = name;
		this.good = good;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", good=" + good + ", duration=" + duration + "]";
	}

}
