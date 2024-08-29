package com.xworkz.washingmachine.runner;

import com.xworkz.washingmachine.Abhishek;
import com.xworkz.washingmachine.Bhukima;
import com.xworkz.washingmachine.Lakshmi;
import com.xworkz.washingmachine.Megha;
import com.xworkz.washingmachine.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {

		Megha megha = new Megha();
		megha.washingmachine();

		Lakshmi lakshmi = new Lakshmi();
		WashingMachine washingMachine = new WashingMachine("bosch", "frontload", 20);
		lakshmi.use(washingMachine);

		WashingMachine washingmachine1 = new WashingMachine("Samsung", "topload", 12);
		Abhishek abhishek = new Abhishek(washingmachine1);

		abhishek.fire();

		Bhukima bhukima = new Bhukima();
		WashingMachine ref = bhukima.use();
		if (ref != null) {
			ref.rinse();
			ref.show();
		}

	}

}
