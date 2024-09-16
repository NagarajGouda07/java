package com.xworkz.internal;

public class IskconTemple implements TempleRule {

	public boolean removeShoes() {
		System.out.println("Removing shoes before entering the temple.");
		return true;
	}

	public boolean maintainCleanliness() {
		System.out.println("Maintaining cleanliness in the temple.");
		return true;
	}

	public boolean LoudTalking() {
		System.out.println("loud talking inside the temple.");
		return false;
	}

	public boolean noPhotography() {
		System.out.println("No photography allowed inside the temple.");
		return true;
	}

	public boolean respectPriests() {
		System.out.println("Respecting priests.");
		return true;
	}

	public boolean followTempleQueue() {
		System.out.println("Following temple queue.");
		return true;
	}

	public boolean donateGenerously() {
		System.out.println("Donating generously.");
		return true;
	}

	public boolean followRituals() {
		System.out.println("Following temple rituals.");
		return true;
	}

	public boolean dressModestly() {
		System.out.println("Dressing modestly inside the temple.");
		return true;
	}

	public boolean noEatingInside() {
		System.out.println("No eating inside the temple.");
		return true;
	}
}
