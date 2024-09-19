package com.xworkz.service.impl;

import com.xworkz.repository.VehicleRepository;
import com.xworkz.service.VehicleService;

public class VehicleServiceImpl implements VehicleService {

	private VehicleRepository vehicleRepository;

	public VehicleServiceImpl(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}

	@Override
	public void persist() {
		if (vehicleRepository != null) {
			System.out.println("Save is not null");
			vehicleRepository.save();
		} else {
			System.out.println("Save is null");
		}

	}

	@Override
	public void merge() {
		if (vehicleRepository != null) {
			System.out.println("update is not null");
			vehicleRepository.update();
		} else {
			System.out.println("update is null");
		}

	}

	@Override
	public void clear() {
		if (vehicleRepository != null) {
			System.out.println("delete is not null");
			vehicleRepository.delete();
		} else {
			System.out.println("delete is null");
		}

	}

	@Override
	public void search() {
		if (vehicleRepository != null) {
			System.out.println("read is not null");
			vehicleRepository.read();
		} else {
			System.out.println("read is null");
		}

	}

}
