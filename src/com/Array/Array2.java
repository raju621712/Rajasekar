package com.Array;

public class Array2 {
	public static void main(String[] args) {
		int[] a= new int[6];
		
		 a[0]=10;
		 a[1]=20;
		 a[2]=30;
		 a[3]=40;
		 a[4]=50;
		 a[5]=60;
		 
		int l= a.length;
	 System.out.println(l);
		 
		System.out.println(a[3]);

		 for (int i = 0; i < a.length; i++) {
			System.out.println(i);
		}
	}

}
