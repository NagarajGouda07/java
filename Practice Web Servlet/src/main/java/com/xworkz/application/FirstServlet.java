package com.xworkz.application;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FirstServlet")
public class FirstServlet implements Servlet {
	ServletConfig config;

	public void init(ServletConfig config) {
		this.config = config;
	}

	public void service(ServletRequest request, ServletResponse response) throws IOException {
		String name = request.getParameter("Enter Your Name");
		String email = request.getParameter("Enter Your Email");
		String passWord = request.getParameter("Enter Your PassWord");
		String contact = request.getParameter("Contact No");

		PrintWriter pw = response.getWriter();
		pw.println("Name =" +name);
		pw.println("Email =" +email);
		pw.println("PassWord =" +passWord);
		pw.println("ContactNo =" +contact);

	}

	public void destroy() {

	}

	public ServletConfig getServletConfig() {
		return config;

	}

	public String getServletInfo() {
		return null;
	}

}
