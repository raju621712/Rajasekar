package com.ExceptionandExceptionhandling;

public class ArrayOutofBoundException {
	
	public static void main(String[] args) {
		
		
	
		
		try {
			
			int a[]= new int[5];
			
			a[0]=1;
			a[1]=2;
			a[2]=3;
			a[3]=4;
			a[4]=5;
			
			
	System.out.println(a[4]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
	}

}
