package com.Raju;

public class SingleInheritance1 extends SingleInheritance {
public void customerDetails() {
	System.out.println("Customer name is:Ram");

}
public static void main(String[] args) {
	SingleInheritance1 s2= new SingleInheritance1();
	s2.LaptopDetails();
	s2.customerDetails();
}
}
