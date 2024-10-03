package com.xworkz.internal.DTO;

import com.xworkz.internal.SeatType;
import com.xworkz.internal.TicketType;

public class TicketBookDTO {
	private String movieName;
	private String theaterName;
	private TicketType ticketType;
	private SeatType seatType;

	public TicketBookDTO(String movieName, String theaterName, TicketType ticketType, SeatType seatType) {
		this.movieName = movieName;
		this.theaterName = theaterName;
		this.ticketType = ticketType;
		this.seatType = seatType;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public TicketType getTicketType() {
		return ticketType;
	}

	public SeatType getSeatType() {
		return seatType;
	}

	public void TicketDetails() {
		System.out.println("Movie Name: " + getMovieName());
		System.out.println("Theater Name: " + getTheaterName());
		System.out.println("Ticket Type: " + getTicketType() + " (Cost: " + ticketType.getCost() + ")");
		System.out.println("Seat Type: " + getSeatType() + " (Seat No: " + seatType.getSeatNo() + ")");
	}

}
