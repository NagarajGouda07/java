package com.xworkz.internal;

public enum TicketType {

	ONLINE(200), OFFLINE(250);

	private int cost;

	TicketType(int cost) {
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

}
