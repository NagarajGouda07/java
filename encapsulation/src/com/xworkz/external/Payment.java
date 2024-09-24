package com.xworkz.external;

// Interface with default method
interface Payment {

	// Abstract method (no implementation)
	void processPayment(double amount);

	// Default method (has an implementation)
	default void transactionDetails() {
		System.out.println("Transaction successful. Thank you for your payment.");
	}

}
