package com.ExceptionandExceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class IndexoutofboundEx {
	public static void main(String[] args) {
		
		List<Integer> ab= new ArrayList<Integer>();
		
		ab.add(10);
		ab.add(20);
		ab.add(30);
		
		System.out.println(ab);
		
		try {
			
			Integer integer = ab.get(4);
			System.out.println(integer);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
