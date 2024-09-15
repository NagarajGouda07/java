package com.xworkz.abstracts;

public abstract class MovieBookingProvider extends BookingProvider {
	

	public MovieBookingProvider(String name, String ceoName) {
		super(name,ceoName);
		System.out.println("created two arg const in MovieBookingProvider");
	}
	public void book() {
		System.out.println("running book in BookingProvider");
	
	}
	public void cancel() {
		System.out.println("running cancel in BookingProvider");
		
	}

}
