package com.xwrokz.logical.reversestring;

public class ReverseString {

	public static void main(String[] args) {

		String str = "nagaraj";
		String rev = "";

		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		System.out.println("Reverse String is : " + rev);

	}

}
