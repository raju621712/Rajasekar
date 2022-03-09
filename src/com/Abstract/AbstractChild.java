package com.Abstract;

public class AbstractChild extends AbstractParent {

	@Override
	public void goldLoan() {
		System.out.println("75%");
		
		
	}

	@Override
	public void bikeLoan() {
		System.out.println("90%");
		
		
	}

	@Override
	public void carLoan() {
		System.out.println("80%");
		
		
	}
	
	public static void main(String[] args) {
		
		AbstractChild ab= new AbstractChild();
		ab.bikeLoan();
		ab.carLoan();
		ab.goldLoan();
		ab.homeLoan();
		ab.perLoan();
		
		
	}

}
