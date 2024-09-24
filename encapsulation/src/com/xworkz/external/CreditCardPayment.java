package com.xworkz.external;

public class CreditCardPayment implements Payment {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing credit card payment of RS=" + amount);
	}

	public static void main(String[] args) {
		Payment creditCard = new CreditCardPayment();
		creditCard.processPayment(150.00); // Calls CreditCardPayment's implementation
		creditCard.transactionDetails(); // Uses the default method from the interface

	}
}
