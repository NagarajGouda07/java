package com.xworkz.exception.runner;

import com.xworkz.exception.InvalidEmailException;
import com.xworkz.exception.service.ServiceCheck;

public class ServiceCheckRunner {

	public static void main(String[] args) throws InvalidEmailException {

		ServiceCheck sc = new ServiceCheck();
		
		sc.mail("Nagaraj@841gmail.com");
		
		sc.Price(145);
		
	}

}
