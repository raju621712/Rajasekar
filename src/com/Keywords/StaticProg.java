package com.Keywords;

public class StaticProg {
	
	//Static Block
	static {
		System.out.println("java");
	}
	
	//Static Variable
	static int b=5;
	
	//Static Method
	public static void demoClass() {
		System.out.println("This is new car");
		

	}

	public static void main(String[] args) {
		StaticProg a= new StaticProg();
		demoClass();
		
		System.out.println(b);
		
	}
}
