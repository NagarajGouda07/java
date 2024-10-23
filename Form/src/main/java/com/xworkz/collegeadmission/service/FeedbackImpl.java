package com.xworkz.collegeadmission.service;

import com.xworkz.collegeadmission.dto.FeedBackDto;
import com.xworkz.collegeadmission.interfaces.FeedBack;

public class FeedbackImpl implements FeedBack {

    @Override
    public boolean validateAndSave(FeedBackDto feedBackDto) {
        System.out.println("Start validating FeedBackDto");

        boolean valid = true;

        if (feedBackDto == null) {
            System.out.println("FeedBackDto is null.. validation failed...");
            return false;
        }

        // Name validation
        String name = feedBackDto.getName();
        if (name != null && !name.isEmpty() && name.length() >= 5) {
            System.out.println("Name is valid...");
        } else {
            System.out.println("Name is invalid...");
            valid = false;
        }

        // Email validation
        String email = feedBackDto.getEmail();
        if (email != null && !email.isEmpty() && email.contains("@") && (email.endsWith(".com") || email.endsWith(".in"))) {
            System.out.println("Email is valid...");
        } else {
            System.out.println("Email is invalid...");
            valid = false;
        }

        // Comments validation
        String comments = feedBackDto.getComments();
        if (comments != null && !comments.isEmpty() && comments.length() >= 25) {
            System.out.println("Comments are valid...");
        } else {
            System.out.println("Comments are invalid...");
            valid = false;
        }

        if (valid) {
            System.out.println("FeedBackDto is valid... Proceed to save.");
        } else {
            System.out.println("FeedBackDto validation failed.");
        }
        
        return valid;
    }
}
