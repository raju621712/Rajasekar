package com.Practice_Pgm;

import java.util.HashMap;
import java.util.Map;

public class HashmapCollections {
	public static void main(String[] args) {
		
		Map<String, Integer> m= new HashMap<>();
		
		m.put("Ravi", 30);
		m.put("Ram", 35);
		m.put("Raja", 20);
		
	//foreach Loop and get method 
			for (String s :m.keySet()) {
			
			System.out.println("Name:"+ s + " Age:" +  m.get(s));
			
		}
		
	}

}
