package com.scanner;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your name");
		String s = sc.nextLine();
		System.out.println("you have entered the:" + s);
		
		System.out.println("Enter your number");
			int b = sc.nextInt();
			System.out.println("The enterd number is:" + b);
	}	
}

