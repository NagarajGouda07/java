package com.xworkz.arraystoree;

import com.xworkz.arraystore.data.MarketData;

import com.xworkz.arraystore.store.MarketStore;

public class MarketRunner {

	public static void main(String[] args) {
		MarketStore store = new MarketStore();
		store.display();
	
		
		MarketData data1 = new MarketData("SuperMart","rajajinagar");
		MarketData data2 = new MarketData("FishMarket", "Majestic");
		store.save(data1);
		store.save(data2);
		
		store.display();
	}

}


