package com.ExceptionandExceptionhandling;

public class NumberFormatEx {
	public static void main(String[] args) {
		
		String b="ram";
		
		
		try {
			
//			int parseInt = Integer.parseInt(b);
//			System.out.println(parseInt);
			
			int parseInt = Integer.parseInt(b);
			System.out.println(parseInt);
			
			
		}catch (NumberFormatException e) {
			
			System.out.println(e);
			
			
		}
	}

}
