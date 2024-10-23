package com.xworkz.collegeadmission.interfaces;

import com.xworkz.collegeadmission.dto.FeedBackDto;

public interface FeedBack {

    boolean validateAndSave(FeedBackDto feedBackDto);

}
