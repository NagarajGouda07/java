package com.xworkz.collegeadmission.service;

import com.xworkz.collegeadmission.dto.MovieTicketDto;
import com.xworkz.collegeadmission.interfaces.MovieTicket;

public class MovieTicketImpl implements MovieTicket  {

    public boolean validateAndSave(MovieTicketDto movieTicketDto) {
        System.out.println("Start validating MovieTicketDto");

        boolean valid = true;

        if (movieTicketDto == null) {
            System.out.println("MovieTicketDto is null.. validation failed...");
            return false;
        }

        // Name validation
        String name = movieTicketDto.getName();
        if (name != null && !name.isEmpty() && name.length() >= 5) {
            System.out.println("Name is valid...");
        } else {
            System.out.println("Name is invalid...");
            valid = false;
        }

        // Total Tickets validation
        String totalTickets = movieTicketDto.getTotalTickets();
        if (totalTickets != null && totalTickets.matches("\\d+")) {
            System.out.println("Total tickets is valid...");
        } else {
            System.out.println("Total tickets is invalid...");
            valid = false;
        }

        // Theater Name validation
        String theaterName = movieTicketDto.getTheaterName();
        if (theaterName != null && !theaterName.isEmpty()) {
            System.out.println("Theater name is valid...");
        } else {
            System.out.println("Theater name is invalid...");
            valid = false;
        }

        // Seat Type validation
        String seatType = movieTicketDto.getSeatType();
        if (seatType != null && !seatType.isEmpty()) {
            System.out.println("Seat type is valid...");
        } else {
            System.out.println("Seat type is invalid...");
            valid = false;
        }

        // Donation validation
        String donation = movieTicketDto.getDonation();
        if (donation != null && !donation.isEmpty() && donation.matches("\\d+")) {
            System.out.println("Donation amount is valid...");
        } else {
            System.out.println("Donation amount is invalid...");
            valid = false;
        }

        // Date validation
        String date = movieTicketDto.getDate();
        if (date != null && !date.isEmpty() && date.matches("\\d{4}-\\d{2}-\\d{2}")) { // Expects date in YYYY-MM-DD format
            System.out.println("Date is valid...");
        } else {
            System.out.println("Date is invalid...");
            valid = false;
        }

        // Time validation
        String time = movieTicketDto.getTime();
        if (time != null && !time.isEmpty() && time.matches("\\d{2}:\\d{2}")) { // Expects time in HH:MM format
            System.out.println("Time is valid...");
        } else {
            System.out.println("Time is invalid...");
            valid = false;
        }

        if (valid) {
            System.out.println("MovieTicketDto is valid... Proceed to save.");
        } else {
            System.out.println("MovieTicketDto validation failed.");
        }

        return valid;
    }
}
