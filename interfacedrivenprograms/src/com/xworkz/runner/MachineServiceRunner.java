package com.xworkz.runner;

import com.xworkz.repository.MachineRepository;
import com.xworkz.repository.implement.machineRepositoryImpl;
import com.xworkz.service.MachineService;
import com.xworkz.service.impl.MachineServiceImpl;

public class MachineServiceRunner {

	public static void main(String[] args) {

		MachineRepository repository = new machineRepositoryImpl();

		MachineService service = new MachineServiceImpl(repository);
		
		  System.out.println("\nTesting MachineService:");
		  service.save();
			System.out.println("----------");
			service.update();
			System.out.println("Updated....");
			System.out.println("----------");
			service.delete();
			System.out.println("Deleted....");
			System.out.println("----------");
			service.read();
			System.out.println("Readed...");
	}

}
