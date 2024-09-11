package com.xworkz.blocks;

public class Dog {

	    {
	        System.out.println("Instance block executed");
	    }
	    
	    public Dog() {
	        System.out.println("Constructor executed");
	    }
	    
	    public static void main(String[] args) {
	    	System.out.println("0000000");
	    	Dog d1= new Dog();  
	    	Dog d2 = new Dog();  
	    }
	}


