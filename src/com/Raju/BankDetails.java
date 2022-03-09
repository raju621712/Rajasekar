package com.Raju;

public class BankDetails implements HDFC {

	@Override
	public void carLoan() {
		System.out.println("25%");
		
	}

	@Override
	public void bikeLoan() {
		System.out.println("45");
		
	}
	public static void main(String[] args) {
		BankDetails b5= new BankDetails();
		b5.bikeLoan();
		b5.carLoan();
	}

}
