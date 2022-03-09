package com.collectionsMap;

import java.util.Map;
import java.util.TreeMap;

public class TreemapCollection {

	public static void main(String[] args) {
		
		Map<Object, Object> c= new TreeMap<>();
		
		c.put(0, "Ram");
		c.put(1, 65);
		c.put(2, 'c');
		c.put(3, 1000);
		c.put(4, 65.32);
		c.put(5, null);
	//	c.put(null, true);
		
		System.out.println(c);
	}
}
