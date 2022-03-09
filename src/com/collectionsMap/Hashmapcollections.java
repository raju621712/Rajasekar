package com.collectionsMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmapcollections {
	
	public static void main(String[] args) {
		
		Map<Object, Object> r= new HashMap<>();
			
		r.put(0, "Raja");
		r.put(1, 'A');
		r.put(2, 70.5);
		r.put(3, 987654321);
		//r.put(null, true);
		//r.put(null, false);
		r.put(4, null);
		r.put(5, null);
	System.out.println(r);

	//Methods
		System.out.println("*********Methods*********");
		
	Object c = r.get(2);
	System.out.println(c);
	
	Object d = r.remove(3);
	System.out.println(d);
	
	int e = r.size();
	System.out.println(e);
	
	//Loop
	
	System.out.println("*******Loop-Keys*********");
	
	for (Object f : r.keySet())  
	{
		System.out.println(f);
		
	}
	
	System.out.println("********Loop-Values");
	
	for (Object g : r.values()) {
		System.out.println(g);
		
	}
	
	
	}

}
