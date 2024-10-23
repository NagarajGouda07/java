package com.xworkz.collegeadmission.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.collegeadmission.dto.CricketTicketDto;
import com.xworkz.collegeadmission.service.CricketTicketImpl;
import com.xworkz.collegeadmission.service.FeedbackImpl;

@WebServlet("/cricket")
public class CricketTicket extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String groundName = request.getParameter("groundName");
		String CustomerName = request.getParameter("CustomerName");
		String CustomEmail = request.getParameter("CustomEmail");
		String SeatType = request.getParameter("SeatType");
		String noOfTickets = request.getParameter("noOfTickets");
	
		CricketTicketDto cricketTicketDto = new CricketTicketDto(groundName,CustomerName,CustomEmail,SeatType,noOfTickets);

		System.out.println(cricketTicketDto+"===========");
		
		CricketTicketImpl CricketTicket = new CricketTicketImpl();
        boolean isValid = CricketTicket.validateAndSave(cricketTicketDto);

        PrintWriter pw = response.getWriter();
		pw.print("Success in sending Dataaa....");
		
		if (isValid) {
            pw.print("<h3>CricketTicket submitted successfully!</h3>");
        } else {
            pw.print("<h3>CricketTicket submission failed. Please correct the errors and try again.</h3>");
        }
	}

}
