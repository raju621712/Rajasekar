package com.Keywords;

public class ThisChild extends ThisParent {
	int a=20;
	
	public void stuD() {
		int a=30;
		System.out.println("Local Variable is :"+ a);
		System.out.println("Class Variable is :"+ this.a);
		System.out.println("Parent Class Variable is :"+ super.a);
		

	}
public static void main(String[] args) {
	ThisChild d=new ThisChild();
	d.stuD();
}
}
