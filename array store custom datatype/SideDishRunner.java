package com.xworkz.arraystoree;

import com.xworkz.arraystore.data.SideDishData;
import com.xworkz.arraystore.store.SideDishStore;

public class SideDishRunner {

	public static void main(String[] args) {
		
	    SideDishStore store = new SideDishStore();
		store.display();
		
			
			SideDishData data1 = new SideDishData("Fries", 2.99, "Snack");
			SideDishData data2 = new SideDishData("Salad", 3.99, "Appetizer");
			store.save(data1);
			store.save(data2);
			
			store.display();
		}
}
