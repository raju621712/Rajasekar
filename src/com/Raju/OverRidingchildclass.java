package com.Raju;

public class OverRidingchildclass extends OverRidingparentclass {
	@Override
	public void stuD() {
		
		super.stuD();
		System.out.println("Ravi");
	}
	public static void main(String[] args) {
		OverRidingchildclass r= new OverRidingchildclass();
		r.stuD();
	}

}
