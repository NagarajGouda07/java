package com.xworkz.abstracts;

public  abstract class JioInternetProvider extends InternetProvider {
	
	

	public JioInternetProvider(String name,String ceo) {
		super(name,ceo);
		System.out.println("created two arg const in JioInternetProvider");

		
	}

}
