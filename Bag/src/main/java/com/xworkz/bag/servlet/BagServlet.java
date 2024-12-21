package com.xworkz.bag.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.bag.dto.BagDto;
import com.xworkz.bag.service.BagService;
import com.xworkz.bag.service.BagServiceImpl;

@WebServlet("/Click")
public class BagServlet extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        // Get the form data from the request
        String bagName = request.getParameter("bagName");
        String bagBrand = request.getParameter("bagBrand");
        String bagColor = request.getParameter("bagColor");
        
        // Create a BagDto object
        BagDto bagDto = new BagDto(bagName, bagBrand, bagColor);
        
        // Create an instance of the service class
        BagService bagService = new BagServiceImpl();
        
        // Validate and save the bag details
        boolean valid = bagService.validateAndSave(bagDto);
        
        if (valid) {
            System.out.println("Bag is valid");
            // Set success message if the bag is valid
            request.setAttribute("success", "Bag is successfully added!");
        } else {
            System.out.println("Bag is In-valid");
            // Set failure message and retain the bagDto for re-entry if invalid
            request.setAttribute("failure", "Please correct the errors and try again.");
            request.setAttribute("dto", bagDto);
        }
        
        // Forward the request back to the JSP page
        request.getRequestDispatcher("/Bag.jsp").forward(request, response);
    }
}
