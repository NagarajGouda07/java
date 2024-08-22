package com.xworkz.arraystore.store;

import com.xworkz.arraystore.data.SideDishData;

public class SideDishStore {
	
	private SideDishData[] datas = new SideDishData[3];
	private int index = 0;

	public void save(SideDishData data){
		System.out.println("save SideDishData");
		this.datas[this.index] = data;
		this.index++;
	}
	
	public void display() {
		System.out.println("Display SideDishData");
		for (SideDishData data : this.datas) {
			if (data != null) {
				data.show();
			} else {
				System.out.println("========");
			}
		}
	}


}
