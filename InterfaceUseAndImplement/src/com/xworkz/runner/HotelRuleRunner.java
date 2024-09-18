package com.xworkz.runner;

import com.xworkz.Interface.HotelRule;
import com.xworkz.implement.CanaraHotelRuleImplement;
import com.xworkz.use.FoodSafteyDepartment;

public class HotelRuleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HotelRule hotelRule = new CanaraHotelRuleImplement();
		FoodSafteyDepartment foodSafteyDepartment = new FoodSafteyDepartment();
		foodSafteyDepartment.setHotelRule(hotelRule);
		foodSafteyDepartment.inspection();

	}

}
