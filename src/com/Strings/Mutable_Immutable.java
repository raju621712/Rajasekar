package com.Strings;

public class Mutable_Immutable {
	
	public static void main(String[] args) {
		
		//Immutable
		
		String r="Raja";
		String r1="Raja";
		String r2="Sekar";
		
		System.out.println("=====Immutable======");
		System.out.println();
		System.out.println(System.identityHashCode(r));
		System.out.println(System.identityHashCode(r1));
		System.out.println(System.identityHashCode(r2));
		
		System.out.println();
		
	        //concat method and return type must be taken
		
		String r3 = r.concat(r1);
		System.out.println(r3);
		System.out.println(System.identityHashCode(r3));
		
		//Mutable
		System.out.println("========Mutable========");
		
		StringBuffer r4= new StringBuffer("Dhoni");
		StringBuffer r5= new StringBuffer("Dhoni");
		StringBuffer r6= new StringBuffer("Caption Cool");
		
		System.out.println();
		System.out.println(System.identityHashCode(r4));
		System.out.println(System.identityHashCode(r5));
		System.out.println(System.identityHashCode(r6));
		System.out.println();
		
	//append method and return type must be taken
		
		StringBuffer r7 = r4.append(r5);
		System.out.println(r7);
		System.out.println(System.identityHashCode(r7));
		
		System.out.println("****************String Bulider*************");
		
		
		
		
		StringBuilder r8= new StringBuilder("Neymar Jr");
		StringBuilder r9= new StringBuilder("Neymar Jr");
		StringBuilder r10= new StringBuilder("Always king in the Football");
		
		System.out.println();
		System.out.println(System.identityHashCode(r8));
		System.out.println(System.identityHashCode(r9));
		System.out.println(System.identityHashCode(r10));
		

		
	StringBuilder r15 = r8.append(r9);
	System.out.println(r15);
	System.out.println(System.identityHashCode(r15));
	
		
		}

}

