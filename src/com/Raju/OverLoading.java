package com.Raju;

public class OverLoading {
	public void stNum(int num) {
		System.out.println("Student Number is:"+num);
		

	}
public void stNum(String name, char ini) {
	System.out.println("Student Name is:"+name+ini);
}
public static void main(String[] args) {
	OverLoading ol= new OverLoading();
	ol.stNum(19);
	ol.stNum("Raja ",'a');
	
}
}
