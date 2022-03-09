package com.collectionsList;

import java.util.List;

public class LinkedList {
	
	public static void main(String[] args) {
	List<Object> ab =new java.util.LinkedList<Object>();
		
		ab.add(10);
		ab.add("Raja");
		ab.add('A');
		ab.add(true);
		ab.add(156320);
		ab.add(15.03);
		
		System.out.println(ab);
		
		ab.add(2, 70);
		System.out.println(ab);		 
		                              //return type

		boolean contains = ab.contains(10);
		System.out.println(contains);	                    
		                           //return type
		Object object = ab.get(5);
		System.out.println(object);
			                        //return type
		int indexOf = ab.indexOf("Raja");
		System.out.println(indexOf);
		
		ab.remove(3);
		System.out.println(ab);
		
		ab.set(1, "Ravi");
		System.out.println(ab);
		                   //return type	
		int size = ab.size();
		System.out.println(size);
		
		ab.clear();
		System.out.println(ab);	
		
	}
	
}
