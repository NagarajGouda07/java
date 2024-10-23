package com.xworkz.collegeadmission.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.collegeadmission.dto.FeedBackDto;
import com.xworkz.collegeadmission.service.FeedbackImpl;

@WebServlet("/feed")
public class FeedBack extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve form data
        String name = request.getParameter("Name");
        String email = request.getParameter("Email");
        String comments = request.getParameter("Comments");

        // Create a DTO to pass to the service
        FeedBackDto feedBackDto = new FeedBackDto(name, email, comments);

        // Service to validate and save feedback
        FeedbackImpl feedbackService = new FeedbackImpl();
        boolean isValid = feedbackService.validateAndSave(feedBackDto);

        // Prepare response
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");

        if (isValid) {
            pw.print("<h3>Feedback submitted successfully!</h3>");
        } else {
            pw.print("<h3>Feedback submission failed. Please correct the errors and try again.</h3>");
        }
    }
}
