package com.xwrokz.logical.reversestring;

public class UsingCharArray {

	public static void main(String[] args) {

		String str = "rajesh";
		String rev = "";

//		char a[] = str.toCharArray();
//		int len = a.length;
//		
//		for (int i = len-1; i>=0; i--) {
//			rev = rev+a[i];
//		}
//
//		System.out.println("Revered string is: " + rev);

		StringBuffer sb = new StringBuffer(str);
		System.out.println("Revered string is: " + sb.reverse());
	}

}
