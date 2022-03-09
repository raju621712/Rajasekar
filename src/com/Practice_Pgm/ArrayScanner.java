package com.Practice_Pgm;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {
	
	public static void main(String[] args) {
		
		int a[]= new int [5];
		
		//int i = 0;
		Scanner s= new Scanner(System.in);
		
		int nextInt = s.nextInt();
	 for (int i=0; i<5; i++)
	 {
			 a[i] = s.nextInt();
			//i = a[i];
	 }
		
		
	
		System.out.println(Arrays.toString(a));
		
		
		
		
	}

}
