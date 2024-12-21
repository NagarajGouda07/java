package com.xworkz.bag.service;

import com.xworkz.bag.dto.BagDto;

public class BagServiceImpl implements BagService {
    @Override
    public boolean validateAndSave(BagDto bagDto) {
        boolean valid = true;

        // Validate bagName
        if (bagDto != null) {
            String bagName = bagDto.getBagName();
            if (bagName == null || bagName.isEmpty()) {
                valid = false;
                System.out.println("In-Valid BagName");
            } else {
                System.out.println("Valid BagName");
            }

            // Validate bagBrand
            String bagBrand = bagDto.getBagBrand();
            if (bagBrand == null || bagBrand.isEmpty()) {
                valid = false;
                System.out.println("In-Valid BagBrand");
            } else {
                System.out.println("Valid BagBrand");
            }

            // Validate bagColor
            String bagColor = bagDto.getBagColor();
            if (bagColor == null || bagColor.isEmpty()) {
                valid = false;
                System.out.println("In-Valid BagColor");
            } else {
                System.out.println("Valid BagColor");
            }
        }

        return valid;
    }
}
