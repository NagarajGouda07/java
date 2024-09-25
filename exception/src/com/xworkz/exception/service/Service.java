package com.xworkz.exception.service;

import com.xworkz.exception.ValidUserNameException;

public class Service {

	public void display(String ValidUserNameException) throws ValidUserNameException {

		if (ValidUserNameException == null || ValidUserNameException.equals(" ")) {
			System.out.println("invalid name will continue exception");
			throw new ValidUserNameException();
		} else {
			System.out.println("valid name will continue exception");
		}
	}

}
