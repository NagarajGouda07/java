package com.xworkz.arraystore.store;

import com.xworkz.arraystore.data.MarketData;

public class MarketStore {
	
	private MarketData[] datas = new MarketData[3];
	private int index = 0;

	public void save(MarketData data){
		System.out.println("save MarketData");
		this.datas[this.index] = data;
		this.index++;
	}
	
	public void display() {
		System.out.println("Display MarketData");
		for (MarketData data : this.datas) {
			if (data != null) {
				data.show();
			} else {
				System.out.println("========");
			}
		}
	}

}
