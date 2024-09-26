package com.xworkz.exception.service;

import com.xworkz.exception.InvalidAmountException;
import com.xworkz.exception.InvalidEmailException;

public class ServiceCheck {

	public void mail(String email) throws InvalidEmailException {

		if (email != null && email.contains("@") && email.contains(".com")) {
			System.out.println("Valid email...");
		} else {
			System.out.println("InValid email...");
			throw new InvalidEmailException();
		}
	}

	public void Price(int price) throws InvalidAmountException {
		if (price > 0 && price <= 150) {
			System.out.println("Valid amount...");
		} else {
			System.out.println("Invalid amount...");
			throw new InvalidAmountException();
		}
	}
}
