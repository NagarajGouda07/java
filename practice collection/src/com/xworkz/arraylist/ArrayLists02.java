package com.xworkz.arraylist;

import java.util.*;

class Student {

	int rollno;
	String name, address;

	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public void isEmpty() {
		// TODO Auto-generated method stub

	}

}

public class ArrayLists02 {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		Student s1 = new Student(1, "Naga", "Agasaladinne");
		Student s2 = new Student(2, "Rajesh", "Kagla");
		Student s3 = new Student(3, "Santhu", "Madhir");
		Student s4 = new Student(4, "Meenakshi", "Bengalore");
		Student s5 = new Student(5, "Meeni", "Mangalore");

		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		// list.remove(3); which index is remove that only deleted
		// list.clear(); All data clear
		

		for (Student s : list) {
			System.out.println(s.rollno + " " + s.name + " " + s.address);
		}
		System.out.println("-----------------");
		System.out.println("  ");
		System.out.println(s3.equals(s5));
		System.out.println(list.isEmpty());
		

	}

}
