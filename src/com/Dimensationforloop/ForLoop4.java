package com.Dimensationforloop;

import java.util.Scanner;

public class ForLoop4 {

	public static void main(String[] args) throws InterruptedException {
		Scanner s= new Scanner(System.in);
		
	//	int rows = s.nextInt();

		for (int i = 1; i <=5; i++) {
			for (int j = 5; j>i; j--) {
				System.out.print(" ");
				
					}
			Thread.sleep(3000);
			
			for (int k = 1; k <=i; k++) {
				System.out.print(i + " ");
				
			}
			System.out.println();
		}
	
		
		
	}
}
