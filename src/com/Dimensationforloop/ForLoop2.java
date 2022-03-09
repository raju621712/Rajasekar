package com.Dimensationforloop;

import java.util.Scanner;

public class ForLoop2 {
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int nextInt = s.nextInt();
		
		for (int i=1; i <=nextInt; i++) {
			for (int j = 1; j <=nextInt; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		
		

}
}
