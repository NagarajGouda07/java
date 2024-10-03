package com.xworkz.internal;

public enum SeatType {

	RECLINER(5), PREMIUM(8), EXECUTIVE(10);

	private int seatNo;

	SeatType(int seatNo) {
		this.seatNo = seatNo;
	}

	public int getSeatNo() {
		return seatNo;
	}

}
