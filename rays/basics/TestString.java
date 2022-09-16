package com.rays.basics;

public class TestString {

	public static void main(String[] args) {
		
		String S="Vijay Dinanath Chauhan"; 
	
		System.out.println( S.length());
		
		System.out.println(S.charAt(6));
	
		System.out.println(S.indexOf("Dinanath"));
		
		System.out.println(S.indexOf("i"));
		
		System.out.println(S.replace("i","a"));
		
		System.out.println(S.replaceAll("a","b"));
		
		System.out.println(S.toLowerCase());
		
		System.out.println(S.toUpperCase());
		
		System.out.println(S.startsWith("V"));
		
		System.out.println(S.endsWith("n"));
		
		System.out.println(S.substring(9));

		
	}
}
