package com.Practice_Pgm;

public class Variables {
	
	//class Variable
	int b=15;
	
	 //Static Variable                      
	public static int c= 20;
	
	
	public void employeeName() {
	 //Local Variable
		int a=10;                   
		System.out.println(a);  
	
	}
	public static void main(String[] args) {
		Variables s=new Variables();
		s.employeeName();
		System.out.println(s.b);
		System.out.println(c);
	}
	

}
