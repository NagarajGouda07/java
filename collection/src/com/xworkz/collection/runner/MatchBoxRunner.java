package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.plaf.synth.SynthScrollBarUI;

import com.xworkz.collection.dto.MatchBoxDTO;

public class MatchBoxRunner {

	public static void main(String[] args) {
		
		MatchBoxDTO matchBoxDTO = new MatchBoxDTO(600.09,"Ramu");
		MatchBoxDTO matchBoxDTO1 = new MatchBoxDTO(100.00);
		MatchBoxDTO matchBoxDTO2 = new MatchBoxDTO("Lion");
		MatchBoxDTO matchBoxDTO3 = new MatchBoxDTO("Tiger");
		MatchBoxDTO matchBoxDTO4 = new MatchBoxDTO("Egale");
		MatchBoxDTO matchBoxDTO5 = new MatchBoxDTO(250.00);
		
		Collection<MatchBoxDTO> collection = new LinkedList<MatchBoxDTO>();
		
		collection.add(matchBoxDTO);
		collection.add(matchBoxDTO1);
		collection.add(matchBoxDTO2);
		collection.add(matchBoxDTO3);
		collection.add(matchBoxDTO4);
		collection.add(matchBoxDTO5);
		
		System.out.println("Total Elements : " + collection.size());
		System.out.println(collection. isEmpty());
		
		System.out.println(collection);
		//collection.clear();
		
		System.out.println("____________");
		//System.out.println("Total Elements : " + collection.size());
		//System.out.println(collection. isEmpty());
		System.out.println("==========");

		Iterator<MatchBoxDTO> iterator = collection.iterator();
		
		while (iterator.hasNext()) {
			MatchBoxDTO ref = iterator.next();
			
			if(ref.getBrand()=="Ramu" ){
				System.out.println(ref);
			}
		
		}
	
	}

}
