package com.xworkz.map;

import java.util.*;
import java.util.Map.Entry;

public class HashTable {

	// this is a total maps topic
	public static void main(String[] args) {

		// creation of a map..
		Map<Integer, String> m = new Hashtable<>();

		// Addition of element into the map
		m.put(101, "Nagaraj");
		m.put(102, "Rajesh");
		m.put(103, "Nagu");
		m.put(104, "Gouda");

		// Retrieve of keys from the map
		Set<Integer> keys = m.keySet();
		for (Integer key : keys) {
			System.out.println(key);

		}

		System.out.println();
		// Retrieve of values from the map
		Collection<String> c = m.values();
		for (String string : c) {
			System.out.println(string);

		}

		System.out.println();
		// Retrieve of values from the map based on the key
		System.out.println(m.get(103));

		for (Integer key : keys) {
			System.out.println(key + " ==== " + m.get(key));

		}

		System.out.println();
		// Deletion of element from the map
		m.remove(101);
		System.out.println(m);

		System.out.println();
		// verification of key in a map
		System.out.println(m.containsKey(102));
		System.out.println(m.containsKey(101));
		System.out.println(m.containsKey(108));

		System.out.println();
		// verification of values in a map
		System.out.println(m.containsValue("nagu"));
		System.out.println(m.containsValue("Gouda"));

		System.out.println(m);
		// Replace the values
		m.replace(104, "gouri");
		System.out.println(m);

		m.putIfAbsent(105, "Gouda");
		System.out.println(m);
		m.clear();
		System.out.println(m);

		Set<Entry<Integer, String>> entries = m.entrySet();
		for (Entry<Integer, String> entry : entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " >>> " + value);

		}
	}

}
