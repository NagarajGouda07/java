package com.xworkz.arraylist;

import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {

		List<String> al = new ArrayList<>();

		al.add("Naga");
		al.add("Naga");
		al.add("Naga");
		al.add("Naga");
		al.add("25");
		al.add("07");
		al.add("3.14");

		// for each loop
		/*
		 * for (String s : al) { System.out.println(s); }
		 */

		// for loop
		/*
		 * for(int i=0; i<al.size(); i++) { //System.out.println(i); // this is index
		 * position System.out.println(al.get(i)); }
		 */

		ListIterator<String> itr = al.listIterator();
		System.out.println("In forward direction");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("In backward direction......");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		al.forEach(a->{
			System.out.println(a);
		});
		
		Iterator<String> itr1 = al.iterator();
		itr1.forEachRemaining(a->{
			System.out.println(a);
			System.out.println("----");
		});
	}

}
