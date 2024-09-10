package com.xworkz.equalsandtostring;

public class State {

	private String name; // instance variables
	private int noOfDistrict; // instance variables
	private int population; // instance variables
	private String stateLang;
	private String ChiefMinister;
	private String capital;

	// Constructor with parameters
	public State(String name, int noOfDistrict, int population, String stateLang, String chiefMinister,
			String capital) {
		super();
		this.name = name;
		this.noOfDistrict = noOfDistrict;
		this.population = population;
		this.stateLang = stateLang;
		this.ChiefMinister = chiefMinister;
		this.capital = capital;
	}

	// over-ride the toString method
	@Override
	public String toString() {
		return "State [name=" + name + ", noOfDistrict=" + noOfDistrict + ", population=" + population + ", stateLang="
				+ stateLang + ", ChiefMinister=" + ChiefMinister + ", capital=" + capital + "]";
	}

	// over-ride the equals method
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running a equals in Country");
		if (obj != null) {
			if (obj instanceof State) {
				State casted = (State) obj; // casted
				if (this.name.equals(casted.name) && this.noOfDistrict == casted.noOfDistrict) {
					System.out.println("left and right is Same");
				}
			} else {
				System.out.println("Obj is a Not State");
			}
		} else {
			System.out.println("Obj is Null");
		}
		return super.equals(obj);
	}

}
