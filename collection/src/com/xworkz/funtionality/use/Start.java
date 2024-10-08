package com.xworkz.funtionality.use;

import com.xworkz.funtionality.FoodApp;
import com.xworkz.funtionality.Mode;

public class Start {
	
	public Start(Mode mode) {
		if(mode != null) {
			mode.display();
			System.out.println("Start is a running");
		}else {
			System.out.println("Start is not running");
		}
	}
	
	public void orderFood(FoodApp foodApp) {
		
		if(foodApp != null) {
			foodApp.order("vgani");
			System.out.println("Start is a vagni.......");

		}
	}

	

	

}
