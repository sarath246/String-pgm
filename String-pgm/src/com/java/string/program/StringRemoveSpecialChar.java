package com.java.string.program;

public class StringRemoveSpecialChar {

	public static void main(String[] args) {

		
		String str = "apple's";
		
		String whiteSpace = " a p p l e ' s";
		
		String planeStr = str.replaceAll("[^a-zA-Z0-9]", "");
		
		String planeStr2 = str.replaceAll("[^0-9]", "");
		
		String trim = whiteSpace.replaceAll("\\s", "");
		
		String trim2 = trim.replaceAll("[^a-zA-Z0-9]", "");
		
		String cap = trim.toUpperCase();
		 
		System.out.println("Plane str :" + planeStr);
		
		System.out.println("Plane str2 :" + planeStr2);
		
		System.out.println("Remove str :" + trim);
		
		System.out.println("Remove all :" + trim2);
		
		System.out.println("Cappital :" + cap);
		
		for (int i = 0; i < str.length(); i++) {
			
			for (int j = i+1; j < str.length(); j++) {
				
				char c1 = str.charAt(i);
				char c2 = str.charAt(j);
				
				if (c1 == c2) {
					
					System.out.println("Duplicate element :" + c1);
					String remDuplElem = str.replace(c1, (char) 0);
					System.out.println("rem :" + remDuplElem);
				}
				
			}
			
		}
		
	}

}
