package com.xworkz.collegeadmission.service;

import com.xworkz.collegeadmission.dto.CricketTicketDto;
import com.xworkz.collegeadmission.interfaces.CricketTicket;

public class CricketTicketImpl implements CricketTicket {

	public boolean validateAndSave(CricketTicketDto cricketTicketDto) {
		System.out.println("Start validating FeedBackDto");

		boolean valid = true;

		if (cricketTicketDto == null) {
			System.out.println("FeedBackDto is null.. validation failed...");
			return false;
		}

		// Name validation
		String groundName = cricketTicketDto.getGroundName();
		if (groundName != null && !groundName.isEmpty() && groundName.length() >= 5) {
			System.out.println("GroundName is valid...");
		} else {
			System.out.println("GroundName is invalid...");
			valid = false;
		}

		String customerName = cricketTicketDto.getCustomerName();
		if (customerName != null && !customerName.isEmpty() && customerName.length() >= 2) {
			System.out.println("CustomerName is valid...");
		} else {
			System.out.println("CustomerName is invalid...");
			valid = false;
		}

		// Email validation
		String customEmail = cricketTicketDto.getCustomEmail();
		if (customEmail != null && !customEmail.isEmpty() && customEmail.contains("@")
				&& (customEmail.endsWith(".com") || customEmail.endsWith(".in"))) {
			System.out.println("CustomEmail is valid...");
		} else {
			System.out.println("CustomEmail is invalid...");
			valid = false;
		}

		String seatType = cricketTicketDto.getSeatType();
		if (seatType != null && !seatType.isEmpty() && seatType.length() >= 1) {
			System.out.println("SeatType are valid...");
		} else {
			System.out.println("SeatType are invalid...");
			valid = false;
		}

		String noOfTickets = cricketTicketDto.getNoOfTickets();
		if (noOfTickets != null && !noOfTickets.isEmpty() && noOfTickets.length() >= 1) {
			System.out.println("NoOfTickets are valid...");
		} else {
			System.out.println("NoOfTickets are invalid...");
			valid = false;
		}

		if (valid) {
			System.out.println("cricketTicketDto is valid... Proceed to save.");
		} else {
			System.out.println("cricketTicketDto validation failed.");
		}

		return valid;
	}

}
