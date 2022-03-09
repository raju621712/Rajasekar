package com.ExceptionandExceptionhandling;

public class NullpointerException {
	
	public static void main(String[] args) {
	
		String s=null;
		
		try {
			
			int length = s.length();
			System.out.println(length);
			
		} catch (NullPointerException e) {
			System.out.println(e);
			
		}
		
		
	}

}
