package com.Raju;

public class Teacher extends StudentDetails {

	@Override
	public void studentTotal() {
		System.out.println("Total is:190");
		
	}
public static void main(String[] args) {
	Teacher t1= new Teacher();
	t1.studentMark();
	t1.studentMark1();
	t1.studentName();
	t1.studentTotal();
}
}
