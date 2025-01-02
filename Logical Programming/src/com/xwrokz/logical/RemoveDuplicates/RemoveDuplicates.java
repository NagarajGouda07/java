package com.xwrokz.logical.RemoveDuplicates;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Example list with duplicates
        List<String> listWithDuplicates = Arrays.asList("apple", "orange", "apple", "banana", "orange");

        // Use a HashSet to remove duplicates
        Set<String> set = new HashSet<>(listWithDuplicates);

        // Convert back to a list (if needed)
        List<String> listWithoutDuplicates = new ArrayList<>(set);

        // Print the result
        System.out.println("Original List: " + listWithDuplicates);
        System.out.println("List Without Duplicates: " + listWithoutDuplicates);
    }
}

