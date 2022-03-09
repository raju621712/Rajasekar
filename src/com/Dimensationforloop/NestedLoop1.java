package com.Dimensationforloop;

import java.util.Scanner;

public class NestedLoop1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int rows = s.nextInt();
		int k=1;
		
		System.out.println("***Printing the Pattern**");
				
	for (int i = 1; i <=rows; i++) {
		for (int j = 1; j <=rows; j++,k++) {
			
			System.out.print(k+"");
			
	
		}
		System.out.println();
	}	
		
	}
}
