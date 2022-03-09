package com.controlstatementloop;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		System.out.println("********Widening Casting******");
		
		int a=9;
		
		double b= a;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println();
		
		System.out.println("***********Narrowing Casting*******");
		
		double e= 9.563;
		
		int f=(int) e;
		
		System.out.println(e);
		System.out.println(f);
		
		
		String s= "1234";
		
		int parseInt = Integer.parseInt(s);
		System.out.println(parseInt);
		
		
		
	
		}

}
