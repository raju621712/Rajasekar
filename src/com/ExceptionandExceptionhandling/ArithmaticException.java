package com.ExceptionandExceptionhandling;

public class ArithmaticException {
	public static void main(String[] args) {
		
		int i=100;
			
		try {
			
			int a=i/0;
			System.out.println(a);	
			
		} 
		catch (ArithmeticException e)
		{
			
			System.out.println(e);
					
		}
		finally {
			System.out.println(i);
		}
		
	}

	
}

