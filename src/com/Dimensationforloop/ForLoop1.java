package com.Dimensationforloop;

import java.util.Scanner;

public class ForLoop1 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int nextInt = sc.nextInt();
		
		
		for (int i=nextInt; i>=1; i--) {
			for (int j =1; j <=i; j++) {
				System.out.print(i);
				
			}
		System.out.println();	
		}
	
	for (int i=2; i<=nextInt; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(i);
			
		}
	System.out.println();	
	}
		
		
		
		
		
		
	}
}
