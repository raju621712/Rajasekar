package com.Dimensationforloop;

public class ForLoop {
	
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				System.out.print(i);
							}
			System.out.println();		
		}
		System.out.println();
	
		
	System.out.println("********upside to downside dimensation forloop**********");
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {			
				System.out.print(i);
					}
			System.out.println();
		}
		System.out.println();
 
		
		
		System.out.println("*****************************");
		for (int i =1; i <=5; i++) {
			for (int j =1; j <=5; j++) {
				System.out.print(j);
				}
			System.out.println();
		}
		
	
		System.out.println("*********Downside to upside dimensation for loop***********");
		for (int i = 5; i>=1; i--) {
			for (int j =1; j <=i; j++) {
				System.out.print(i);
					}
			System.out.println();
		}
		
		System.out.println("*******************************");
		for (int i =5; i>=1; i--) {
			for (int j =1; j <=i; j++) {
				System.out.print(j);		
	}
			System.out.println();
}
		
		
		
		
		
}
}
