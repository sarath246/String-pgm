package com.java.string.program;

public class StringFIrstLast {

	public static void main(String[] args) {

		
		String str = "apple";
		
		String str2 = new String("apple");
		
		System.out.println("First char :" + str2.charAt(0));
		System.out.println("Last char :" + str2.charAt(str2.length()-1));
		System.out.println("len :" + str2.length());
		
	}

}
