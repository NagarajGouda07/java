package com.xworkz.runner;

import com.xworkz.repository.VehicleRepository;
import com.xworkz.repository.implement.VehicleRepositoryImpl;
import com.xworkz.service.VehicleService;
import com.xworkz.service.impl.VehicleServiceImpl;

public class VehicleServiceRunner {

	public static void main(String[] args) {

		VehicleRepository repository = new VehicleRepositoryImpl();

		VehicleService service = new VehicleServiceImpl(repository);

		System.out.println("VehicleServiceRunner is a runner:");
		service.persist();
		System.out.println("----------");
		service.merge();
		System.out.println("Updated....");
		System.out.println("----------");
		service.clear();
		System.out.println("Deleted....");
		System.out.println("----------");
		service.search();
		System.out.println("Readed...");
	}

}
