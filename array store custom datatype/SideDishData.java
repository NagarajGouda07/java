package com.xworkz.arraystore.data;

public class SideDishData {
	
	    private String name;
	    private double price;
	    private String type;

	    public SideDishData(String name, double price, String type) {
	        this.name = name;
	        this.price = price;
	        this.type = type;
	    }

	    public void show() {
	        System.out.println("SideDishName :" + name);
	        System.out.println("Price :" + price);
	        System.out.println("Type :" + type);
	    }

}
