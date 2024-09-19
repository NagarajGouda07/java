package com.xworkz.service.impl;

import com.xworkz.repository.MachineRepository;
import com.xworkz.service.MachineService;

public class MachineServiceImpl implements MachineService {

	private MachineRepository machineRepository;

	public MachineServiceImpl(MachineRepository machineRepository) {
		this.machineRepository = machineRepository;
	}

	public void save() {
		if (machineRepository != null) {
			System.out.println("Save is not Null");
			machineRepository.save();
		} else {
			System.out.println("Save is Null");
		}

	}

	@Override
	public void update() {
		if (machineRepository != null) {
			System.out.println("update is not Null");
			machineRepository.update();
		} else {
			System.out.println("update is Null");
		}

	}

	@Override
	public void delete() {
		if (machineRepository != null) {
			System.out.println("delete is not Null");
			machineRepository.delete();
		} else {
			System.out.println("delete is Null");
		}

	}

	@Override
	public void read() {

		if (machineRepository != null) {
			System.out.println("read is not Null");
			machineRepository.read();
		} else {
			System.out.println("read is Null");
		}

	}

}
