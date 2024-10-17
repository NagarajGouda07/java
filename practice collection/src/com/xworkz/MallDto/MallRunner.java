package com.xworkz.MallDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class MallRunner {

	public static void main(String[] args) {

		Collection<MallDto> collection = new ArrayList<MallDto>();

		MallDto mall1 = new MallDto(1, "MARKETCITY", Location.KORAMANGALA, "Nagaraj", 55000.0);
		MallDto mall2 = new MallDto(852, "ORIONMALL", Location.INDIRANAGAR, "depak", 65000.0);
		MallDto mall3 = new MallDto(523, "FORUMMALL", Location.WHITEFIELD, "darshan", 1050000.0);
		MallDto mall4 = new MallDto(74, "UBCITYMALL", Location.JAYANAGAR, "Sachin", 250080.0);
		MallDto mall5 = new MallDto(501, "MANTRI_MALL", Location.MALLESWARAM, "Ajay", 65600.0);
		MallDto mall6 = new MallDto(65, "VR_BENGALURU", Location.AGASALADINNE, "arun", 68000.0);
		MallDto mall7 = new MallDto(37, "ESTEEMMALL", Location.MARATHAHALLI, "kiran", 85200.0);
		MallDto mall8 = new MallDto(28, "GARUDAMALL", Location.KOWTHALAM, "Manoj", 152000.0);
		MallDto mall9 = new MallDto(99, "BANG_CENTRAL_MALL", Location.BALLARI, "vinayak", 259100.0);
		MallDto mall10 = new MallDto(120, "GOPALA", Location.RAJAJINAGAR, "Meena", 469520.0);

		collection.add(mall1);
		collection.add(mall2);
		collection.add(mall3);
		collection.add(mall4);
		collection.add(mall5);
		collection.add(mall6);
		collection.add(mall7);
		collection.add(mall8);
		collection.add(mall9);
		collection.add(mall10);

		System.out.println("size is:" + collection.size());

		collection.stream().sorted((ref1, ref2) -> Double.compare(ref2.getId(), ref1.getId()))
				.forEach(ref -> System.out.println(ref));

		System.out.println("=================================================");

		collection.stream().sorted((ref1, ref2) -> ref2.getName().compareTo(ref1.getName()))
				.forEach(ref -> System.out.println(ref));

		System.out.println("=================================================");

		collection.stream().filter(ref -> ref.getLandDimension() < 100000).forEach(ref -> System.out.println(ref));

		System.out.println("=================================================");

		collection.stream().map(ref -> ref.getName()).forEach(ref -> System.out.println(ref));

		System.out.println("=================================================");

		collection.stream().sorted((ref1, ref2) -> Double.compare(ref1.getLandDimension(), ref2.getLandDimension()))
				.map(ref -> ref.getLandDimension()).forEach(ref -> System.out.println(ref));

		System.out.println("=================================================");

		Iterator<MallDto> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("=================================================");

		ListIterator<MallDto> listIterator = ((ArrayList<MallDto>) collection).listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}
}
