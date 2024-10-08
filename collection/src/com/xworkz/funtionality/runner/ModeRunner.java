package com.xworkz.funtionality.runner;

import com.xworkz.funtionality.FoodApp;
import com.xworkz.funtionality.Mode;
import com.xworkz.funtionality.use.Start;

public class ModeRunner {

	public static void main(String[] args) {

		Mode mode = () -> {
			System.out.println("ModeRunner is running...........");
		};
		Start start = new Start(mode);
		
		
		FoodApp foodApp = (String item)->{
			System.out.println("FoodApp is running...........");

		};
		start.orderFood(foodApp);
	
		
	}

}
