package com.Variables;

public class StaticVariables {
	
	static int b= 65;
	
	int c=52;
	int d=50;
	
	public void student() {
		int a=70;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		

	}
public static void main(String[] args) {
	StaticVariables h= new StaticVariables();
	h.student();
	System.out.println(h.c);
	System.out.println(h.d);
	System.out.println(b);
}

}


