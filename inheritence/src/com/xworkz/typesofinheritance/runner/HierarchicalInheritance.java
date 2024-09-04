package com.xworkz.typesofinheritance.runner;

import com.xworkz.typesofinheritance.Circle;
import com.xworkz.typesofinheritance.Rectangle;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		 Circle circle = new Circle();
	        Rectangle rectangle = new Rectangle();

	        circle.draw();    
	        circle.area();    

	        rectangle.draw();  
	        rectangle.area();  

	}

}
