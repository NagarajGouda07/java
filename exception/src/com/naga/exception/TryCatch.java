package com.naga.exception;

public class TryCatch {

	public static void main(String[] args) {
		System.out.println("This is a Start Try & Catch example");

		//try block must be followed by either catch or finally 
		//try block we can't use try block alone
		try {
			int a = 10;
			int b = 0;
			int c = a / b;

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}

		// catch block is used in number of catch blocks
		catch (ArithmeticException ae) {
			ae.printStackTrace();
		}

		catch (Exception e) {
			e.printStackTrace(); // this working is exception name, reason, line no, method, classes, program
									// name
			// System.out.println(e.toString()); //this working is exception name, reason
			// System.out.println(e.getMessage()); //this working is reason
		} 
		
		finally { //finally keyword is used to execute the important code of the program
			System.out.println("Running is finally............");
		}
		System.out.println("Try.........");
		System.out.println("This is a end Try & Catch example.....");
	}

}
