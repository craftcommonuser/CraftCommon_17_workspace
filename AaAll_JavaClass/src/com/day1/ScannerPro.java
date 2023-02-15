package com.day1;

import java.util.Scanner;

public class ScannerPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var= new Scanner(System.in);
		System.out.println("Enter fName : ");
		String firstName= var.next();
		System.out.println("Enter lName : ");
		String lastName=var.next();
		
		
		System.out.println("Full Name is : " + firstName  + "  " + lastName);
	var.close();}

}
