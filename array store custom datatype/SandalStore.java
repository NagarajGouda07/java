package com.xworkz.arraystore.store;

import com.xworkz.arraystore.data.Sandal;

public class SandalStore {

	private Sandal[] datas = new Sandal[5];
	private int index = 0;

	public void save(Sandal data){
		System.out.println("save Sandal");
		this.datas[this.index] = data;
		this.index++;
	}
	
	public void display() {
		System.out.println("Display Sandal");
		for (Sandal data : this.datas) {
			if (data != null) {
				data.show();
			} else {
				System.out.println("========");
			}
		}
	}

}
