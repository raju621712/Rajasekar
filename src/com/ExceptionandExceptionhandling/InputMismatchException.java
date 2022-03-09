package com.ExceptionandExceptionhandling;

import java.util.Scanner;

public class InputMismatchException {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		try {
			
			
			int nextInt = s.nextInt();
			System.out.println(nextInt);
			
		} catch (java.util.InputMismatchException e){
			System.out.println(e);
			
		}
		
	}

}
