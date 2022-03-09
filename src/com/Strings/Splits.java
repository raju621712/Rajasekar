package com.Strings;

public class Splits {
	public static void main(String[] args) {
		
		String s= "Welcome to java, it is programming language, it is easy to learn this language, there are lots of concepts available in this Language";
	
		
		String[] r = s.split(",");
		
	
		for (int i = 0; i < r.length; i++) {
		System.out.println(r[i]);
			
		}
		
		//For Each Loop
		System.out.println("*******************");
		
		String[] m = s.split(", ", 2);
		for (String b : m) {
			System.out.println(b);
			
		}
	}
	
	
	

}
