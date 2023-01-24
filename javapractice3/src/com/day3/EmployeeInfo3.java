package com.day3;

import java.util.Scanner;

public class EmployeeInfo3 {

	public static void main(String[] args) {;
		Scanner in = new Scanner(System.in);
		
		System.out.println(" enter your firstName:");
		String firstName = in.nextLine();
		
		System.out.println("enter your lastName:");
		String lastName = in.nextLine();
		
		System.out.println("enter your age:");
		int age = in.nextInt();
		
		System.out.println("Enter your salary:");
		double salary = in.nextDouble();
		
		System.out.println("employee name:" + firstName);
		System.out.println("employee lastname:" + lastName);
		System.out.println("employee age:" + age);
		System.out.println("employee salary:" + salary);

	}

}
