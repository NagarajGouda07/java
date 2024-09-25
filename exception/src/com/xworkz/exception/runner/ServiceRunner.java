package com.xworkz.exception.runner;

import com.xworkz.exception.ValidUserNameException;
import com.xworkz.exception.service.Service;

public class ServiceRunner {

	public static void main(String[] args) throws ValidUserNameException {

		Service runner = new Service();
		runner.display(" naga");
	}

}
