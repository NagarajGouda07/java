package com.xworkz.collegeadmission.service;

import com.xworkz.collegeadmission.dto.CollegeAdmissionDto;
import com.xworkz.collegeadmission.interfaces.CollegeAdmission;

public class CollegeImpl implements CollegeAdmission {

	@Override
	public boolean validateAndSave(CollegeAdmissionDto collegeAdmissionDto) {
		System.out.println("Start validating FeedBackDto");

		boolean valid = true;

		if (collegeAdmissionDto == null) {
			System.out.println("FeedBackDto is null.. validation failed...");
			return false;
		}

		// Name validation
		String name = collegeAdmissionDto.getName();
		if (name != null && !name.isEmpty() && name.length() >= 5) {
			System.out.println("Name is valid...");
		} else {
			System.out.println("Name is invalid...");
			valid = false;
		}

		// Email validation
		String email = collegeAdmissionDto.getEmail();
		if (email != null && !email.isEmpty() && email.contains("@")
				&& (email.endsWith(".com") || email.endsWith(".in"))) {
			System.out.println("Email is valid...");
		} else {
			System.out.println("Email is invalid...");
			valid = false;
		}

		// Mobile validation
		String mobile = collegeAdmissionDto.getMobile();
		if (mobile != null && mobile.matches("\\d{10}")) {
			System.out.println("Mobile number is valid...");
		} else {
			System.out.println("Mobile number is invalid...");
			valid = false;
		}

		// Address validation
		String address = collegeAdmissionDto.getAddress();
		if (address != null && !address.isEmpty() && address.length() >= 10) {
			System.out.println("Address is valid...");
		} else {
			System.out.println("Address is invalid...");
			valid = false;
		}

		// Father name validation
		String fathername = collegeAdmissionDto.getFathername();
		if (fathername != null && !fathername.isEmpty() && fathername.length() >= 5) {
			System.out.println("Father's name is valid...");
		} else {
			System.out.println("Father's name is invalid...");
			valid = false;
		}

		// Mother name validation
		String mothername = collegeAdmissionDto.getMothername();
		if (mothername != null && !mothername.isEmpty() && mothername.length() >= 5) {
			System.out.println("Mother's name is valid...");
		} else {
			System.out.println("Mother's name is invalid...");
			valid = false;
		}

		// Percentage validation
		String percentage = collegeAdmissionDto.getPercentage();
		if (percentage != null && !percentage.isEmpty()) {
			try {
				double percent = Double.parseDouble(percentage);
				if (percent >= 0 && percent <= 100) {
					System.out.println("Percentage is valid...");
				} else {
					System.out.println("Percentage is invalid...");
					valid = false;
				}
			} catch (NumberFormatException e) {
				System.out.println("Percentage is invalid...");
				valid = false;
			}
		} else {
			System.out.println("Percentage is invalid...");
			valid = false;
		}

		// Course validation
		String course = collegeAdmissionDto.getCourse();
		if (course != null && !course.isEmpty()) {
			System.out.println("Course is valid...");
		} else {
			System.out.println("Course is invalid...");
			valid = false;
		}

		// Age validation
		String age = collegeAdmissionDto.getAge();
		if (age != null && !age.isEmpty()) {
			try {
				int ageInt = Integer.parseInt(age);
				if (ageInt > 0 && ageInt <= 100) {
					System.out.println("Age is valid...");
				} else {
					System.out.println("Age is invalid...");
					valid = false;
				}
			} catch (NumberFormatException e) {
				System.out.println("Age is invalid...");
				valid = false;
			}
		} else {
			System.out.println("Age is invalid...");
			valid = false;
		}

		if (valid) {
			System.out.println("FeedBackDto is valid... Proceed to save.");
		} else {
			System.out.println("FeedBackDto validation failed.");
		}

		return valid;
	}
}
