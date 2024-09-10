package com.xworkz.equalsandtostring.runner;

import com.xworkz.equalsandtostring.State;

public class StateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		State state = new State("Tamil Nadu", 38, 888880, "Tamil", "MK Stalin", "Chennai");

		State state2 = new State("Kerala", 14, 38970000, "Malayalam", "Pinarayi", "Thiruvananthapuram");

		boolean areEqual = state.equals(state2);
		System.out.println("State and State2 is:" + areEqual);
	}

}
