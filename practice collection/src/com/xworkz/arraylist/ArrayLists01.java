package com.xworkz.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayLists01 {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();

		al.add("Nagaraj");
		al.add("Rajesh");
		al.add("Mahaling");
		al.add("yash");
		al.add("Praboss");
		al.add("Giresh");
		al.add("Golimar");
		al.add(3, "Chitu");//add index position for elements
		
		List<String> a2 = new ArrayList<>();
		a2.add("yash");
		a2.add("Praboss");
		a2.addAll(al);
		a2.add("Giresh..");
		a2.add("Golimar....");
		a2.add(0, "Shiva");//add index position for elements
		a2.clear();
		
		for(String s:al) {
			System.out.println(s);
		}
		System.out.println("  ");
		
		for(String s:a2) {
			System.out.println(s);
		}
		
		List<String> a3 = new ArrayList<>();
		a3.add("Nagaraj");
		a3.add("Rajesh s");
		a3.add("Rajahuli");
		
		List<String> a4 = new ArrayList<>();
		a4.add("Nagaraj");
		a4.add("Rajesh s");
		a4.add("Rajahuli");
		
		System.out.println(a3.equals(a4));// this method is compare to values
		System.out.println(a3.isEmpty());
		System.out.println("");
		
		
		List<String> a5 = new ArrayList<>();

		a5.add("Nagaraj");
		a5.add("Rajesh");
		a5.add("Mahaling");
		a5.add("yash");
		a5.add("Praboss");
		a5.add("Nagaraj");
		a5.add("Giresh");
		a5.add("Mahaling");
		a5.add("Golimar");
		a5.remove("Praboss");// this is remove element
		a5.set(6, "Ravitej..."); //this set method is means replace value 
		
		System.out.println(a5);
		
		System.out.println(a5.lastIndexOf("Nagaraj"));// this is last position 
		System.out.println(a5.lastIndexOf("Mahaling"));
		System.out.println("--------");
		System.out.println(a5.indexOf("Nagaraj"));// this is first position
		System.out.println(a5.indexOf("Mahaling"));
		System.out.println(a5.indexOf("Kalki"));// this element is not their value is -1
		System.out.println("--------");
		System.out.println(a5.contains("Kalki"));
		System.out.println(a5.contains("Nagaraj"));
		
		List<String> a6 = new ArrayList<>();

		a6.add("Nagaraj");
		a6.add("Rajesh");
		a6.add("Mahaling");
		a6.add("yash");
		a6.add("Praboss");
		a6.add("Giresh");
		a6.add("Golimar");
		a6.add("Amar");
		a6.add("Amula");
		a6.add("amra");
		a6.sort(String.CASE_INSENSITIVE_ORDER);// this is a ordered
		a6.sort(Comparator.naturalOrder());//this is upper case & lower case letter saparted
		
		System.out.println(a6);
		System.out.println(a6.subList(2, 8));
		
	}

}
