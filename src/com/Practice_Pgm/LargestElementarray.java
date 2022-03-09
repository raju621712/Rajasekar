package com.Practice_Pgm;

public class LargestElementarray {
	public static void main(String[] args) {
		
		int [] ar= new int[] {25,11,7,75,56};
		int max= ar[0];
		
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i]>max) {
				
				max= ar[i];
				
			}
				System.out.println("Largest Element in Array:" + max);
			
		}
	}
	

}
