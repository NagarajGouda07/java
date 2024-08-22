package com.xworkz.arraystore.data;

public class MarketData {
    private String name;
    private String location;

    public MarketData(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void show() {
        System.out.println("MarketName: " + this.name);
        System.out.println("Location: " + this.location);
      
    }

}
