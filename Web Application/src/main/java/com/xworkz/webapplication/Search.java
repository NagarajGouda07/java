package com.xworkz.webapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("Name");
		String email = request.getParameter("Email");
		
		
		PrintWriter pw = response.getWriter();
		//pw.print("Name = " + name);
		//pw.print("Email = " + email);
		
		pw.println("Search is Success....");
	}

}
