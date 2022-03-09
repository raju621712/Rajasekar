package com.ExceptionandExceptionhandling;

public class StringIndexoutofboundEx {
	
	public static void main(String[] args) {
		
		String a="Welcome to Paris";
		
		try {
			char charAt = a.charAt(20);
			System.out.println(charAt);
			
		} catch (StringIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}
		
		
	}

}
