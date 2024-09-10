package com.xworkz.equalsandtostring.runner;

import com.xworkz.equalsandtostring.Country;

public class CountryRunner {

	public static void main(String[] args) {

		Country country = new Country("India", 28, 9876, "Narandira", 1950, 91);

		Country country2 = new Country("America", 50, 85329, "Joe Biden", 1776, 001);

		boolean compare = country.equals(country2);
		System.out.println("Country and Country2 is :" + compare);
	}

}
