package com.xworkz.internal.runner;

import com.xworkz.internal.ProductType;
import com.xworkz.internal.SeatType;
import com.xworkz.internal.TicketType;
import com.xworkz.internal.DTO.CustomerDTO;
import com.xworkz.internal.DTO.TicketBookDTO;

public class Runneer {

	public static void main(String[] args) {
		
		CustomerDTO customer1 = new CustomerDTO("Rajesh", "Srajeshrocky@123.com", ProductType.KITCHEN);
		customer1.displayCustomerDTO();

		System.out.println("------------------------------");

		for (ProductType productTpye : ProductType.values()) {
			System.out.println(productTpye);
			
		}

		System.out.println("####################################");

		TicketBookDTO ticket = new TicketBookDTO("Avengers", "Cineplex", TicketType.ONLINE, SeatType.RECLINER);
		ticket.TicketDetails();

		System.out.println("------------------------------");

		for (TicketType ticketType : TicketType.values()) {
			System.out.println(ticketType);
			System.out.println(ticketType +" : "+ticketType.getCost());
		}

		System.out.println("####################################");

		TicketBookDTO ticket1 = new TicketBookDTO("Devara", "IMAX", TicketType.OFFLINE, SeatType.PREMIUM);
		ticket1.TicketDetails();

		System.out.println("------------------------------");

		for (SeatType seatType : SeatType.values()) {
			System.out.println(seatType);
			System.out.println(seatType + " : " + seatType.getSeatNo());

		}

	}
}
