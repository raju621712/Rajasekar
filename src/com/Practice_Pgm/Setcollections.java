package com.Practice_Pgm;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Setcollections {
	
	public static void main(String[] args) {
		
		Set<String> ab= new HashSet<String>();
		
		ab.add("Volvo");
		ab.add("BMW");
		ab.add("Mazda");
		ab.add("Ford");
		ab.add("Skoda");
		
		System.out.println(ab);
		
		//methods
		
//		System.out.println(ab.contains("Ford"));
//		
//		System.out.println(ab.contains("BMW"));
//		
//		System.out.println(ab.remove("Skoda"));
//		
//		System.out.println(ab.size());
//		
//		
		
		//Loop
		
	//	for (String s : ab) {
			
		//	System.out.println(ab);
	//	}
			
			
			

		Set<String> a= new TreeSet<String>();
			
			a.add("Volvo");
			a.add("BMW");
			a.add("nahg");
			a.add("Fohfvs");
			a.add("Skoda");
//			a.add('a');
//			a.add('m');
			
			System.out.println(a);	
			
			ab.retainAll(a);
			System.out.println(ab);
			
			
	
	}
	
 	
	}


