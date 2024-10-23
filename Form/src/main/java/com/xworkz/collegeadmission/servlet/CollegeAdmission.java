package com.xworkz.collegeadmission.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.collegeadmission.dto.CollegeAdmissionDto;
import com.xworkz.collegeadmission.service.CollegeImpl;
import com.xworkz.collegeadmission.service.CricketTicketImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/Submit")
public class CollegeAdmission extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public CollegeAdmission() {
		System.out.println("running CollegeAdmission=============");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String address = request.getParameter("address");
		String fathername = request.getParameter("fathername");
		String mothername = request.getParameter("mothername");
		String percentage = request.getParameter("percentage");
		String course = request.getParameter("course");
		String age = request.getParameter("age");

		System.out.println(name + "========");
		CollegeAdmissionDto collegeAdmissionDto = new CollegeAdmissionDto(name, email, mobile, address, fathername, mothername,
				percentage, course, age);
		System.out.println("constructor ====" + collegeAdmissionDto);

		CollegeImpl CollegeAdmission = new CollegeImpl();
        boolean isValid = CollegeAdmission.validateAndSave(collegeAdmissionDto);

        PrintWriter pw = response.getWriter();
		pw.print("Success in sending Dataaa....");
		
		if (isValid) {
            pw.print("<h3>collegeAdmission submitted successfully!</h3>");
        } else {
            pw.print("<h3>collegeAdmission submission failed. Please correct the errors and try again.</h3>");
        }
	}

}
