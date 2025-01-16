package com.xwrokz.logical.SeparateAlphabets;

public class SeparateAlphabets {
    public static void main(String[] args) {
        String input = "abc123!@#XYZ";
        String alp = "";
        String num = "";
        String spl = "";
        char[] ch = input.toCharArray();

        for (int i=0;i<=ch.length-1;i++) {
            if (Character.isAlphabetic(ch[i])) {
            	alp = alp+ch[i];
            	
            }
            else if (Character.isDigit(ch[i])) {
            	num = num+ch[i];
            	
            }
            else {
            	spl = spl+ch[i];
            	
            }
        }

        System.out.println("Alphabets: " + alp   + "   Num =" + num + "  spl= "+spl);
    }
}

