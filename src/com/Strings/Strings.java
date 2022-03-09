package com.Strings;

public class Strings {
	public static void main(String[] args) {
		
		String s="This is new car";
		
         	int a = s.length();
			System.out.println(a);
		
			boolean b = s.equals("This is car");
			System.out.println(b);
		
			int c = s.indexOf('e');
			System.out.println(c);
	
			char d = s.charAt(9);
			System.out.println(d);
		
			boolean e = s.startsWith(" This");
			System.out.println(e);
		
			boolean f = s.contains("new");
			System.out.println(f);
		
			String g = s.replace('c', 'I');
			System.out.println(g);
		
			String h = s.toLowerCase();
			System.out.println(h);
		
			String i = s.toUpperCase();
			System.out.println(i);
			
			int j = s.lastIndexOf('i');
			System.out.println(j);
	}
	

}
