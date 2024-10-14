package com.xworkz.application;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Rajesh implements Servlet {
	ServletConfig config;

	@Override
	public void destroy() {

	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig config) {
		this.config = config;
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("Name");
		String email = request.getParameter("Email");
		String address = request.getParameter("Address");
		String dof = request.getParameter("Date Of Birth");
		
		PrintWriter pw = response.getWriter(); 
		pw.print("Name = " + name);
		pw.print("Email = " + email);
		pw.print("Address = " + address);
		pw.print("Date Of Birth = " + dof);
		
	}

}
