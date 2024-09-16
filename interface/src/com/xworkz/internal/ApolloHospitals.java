package com.xworkz.internal;

public class ApolloHospitals implements HospitalRule {

	public boolean maintainSilence() {
		System.out.println("Maintaining silence in the hospital.");
		return true;
	}

	public boolean followVisitingHours() {
		System.out.println("Following visiting hours.");
		return true;
	}

	public boolean noSmoking() {
		System.out.println("No smoking in the hospital.");
		return true;
	}
}
