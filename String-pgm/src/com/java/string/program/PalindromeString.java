package com.java.string.program;

public class PalindromeString {

	public static void main(String[] args) {

		
		String str = "malayalam";
		int len = str.length();
		String rev = "";
		
		for (int i = len-1; i >=0; i--) {
			
			rev = rev + str.charAt(i);
		}
		System.out.println("String :" + str);
		System.out.println("reverse :" + rev);
		if (str.matches(rev)) {
			
			System.out.println("Palindrome :Yes");
		}
		else {
			
			System.out.println("Palindrome :No");
		}
	}

}
