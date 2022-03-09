package com.collectionsMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {
	
	public static void main(String[] args) {
		
		Map<Object, Object> a= new LinkedHashMap<>();
		
		a.put(0, "Ravi");
		a.put(1, 'S');
		a.put(2, 1515);
		a.put(3, 80.4563);
		a.put(4, null);
		a.put(5, null);
		a.put(null, true);
		a.put(null, false);
		
		System.out.println(a);
	}

}
