package com.collectionsSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetcollectionLinkedHashset {
	
	public static void main(String[] args) {
		
		Set<Object> rs= new LinkedHashSet<Object>();
		
		rs.add('s');
		rs.add("Sam");
		rs.add(19);
		rs.add(150.00);
		rs.add(1995);
		rs.add(null);
		rs.add(19);
		rs.add(null);
		rs.add('s');
		
		System.out.println(rs);
		
	}

}
