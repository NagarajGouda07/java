package com.xworkz.abstracts.runner;

import java.time.LocalDate;

import com.xworkz.abstracts.BookMyShowMovieBookingProvider;
import com.xworkz.abstracts.DellProvider;
import com.xworkz.abstracts.Fast5gExtreme;
import com.xworkz.abstracts.LenovoProvider;
import com.xworkz.abstracts.SatJioInternetProvider;

public class Runner {

	public static void main(String[] args) {

		BookMyShowMovieBookingProvider provider = new BookMyShowMovieBookingProvider("BSNL", "Pravin Kumar Purwar",
				200);
		provider.book();
		provider.cancel();
		provider.service();
		System.out.println(provider);

		System.out.println("----------------------");

		DellProvider dellProvider = new DellProvider("Dell", "Michael");
		dellProvider.service();
		System.out.println(dellProvider);

		System.out.println("------------------------");

		LenovoProvider lenovoProvider = new LenovoProvider("lenovo", "Yang Yuanqing", 20);
		System.out.println(lenovoProvider);
		lenovoProvider.service();

		System.out.println("-----------------------");

		Fast5gExtreme fast = new Fast5gExtreme("Airtel", "Gopal Vittal");
		System.out.println(fast);

		System.out.println("-----------------------");
		LocalDate date = LocalDate.now();
		SatJioInternetProvider sat = new SatJioInternetProvider("Jio", "Jayaraman", 300, date);
		System.out.println(sat);

	}

}
