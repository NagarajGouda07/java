package com.xworkz.arraystoree;

import com.xworkz.arraystore.data.Sandal;
import com.xworkz.arraystore.store.SandalStore;

public class SandalRunner {

	public static void main(String[] args) {
		
		SandalStore store = new SandalStore();
		store.display();
	
		
		Sandal data1 = new Sandal("Mine",'s', 50,"green");
		Sandal data2 = new Sandal("joker",'m', 500,"yellow");
		store.save(data1);
		store.save(data2);
		
		store.display();
	}

}
