package com.Practice_Pgm;

public class Arrayreverse {
	public static void main(String[] args) {
		
		int [] a=new int[5];
		
		a[0]=5;
		a[1]=10;
		a[2]=15;
		a[3]=20;
		a[4]=25;
		
		int s = a.length;
	//	System.out.println(s);
		
		// System.out.println(a[3]);
		
	//	for (int i = 0; i < a.length; i++) {
	//		System.out.println(a[i]);
		 
		 for (int i = a.length-1; i>=0; i--) {
			 System.out.println(a[i]);
			
		}
			
			
			
		}
		
	}



