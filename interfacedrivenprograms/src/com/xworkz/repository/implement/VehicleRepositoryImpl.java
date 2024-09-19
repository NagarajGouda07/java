package com.xworkz.repository.implement;

import com.xworkz.repository.VehicleRepository;

public  class VehicleRepositoryImpl implements VehicleRepository {

	
	 
	@Override
    public void save() {
        System.out.println("Vehicle saved.");
    }

    @Override
    public void update() {
        System.out.println("Vehicle updated.");
    }

    @Override
    public boolean delete() {
        System.out.println("Vehicle deleted.");
        return true;
    }

    @Override
    public String read() {
        System.out.println("Vehicle read.");
        return "Some Vehicle";
    }
	 

}
