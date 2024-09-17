package com.icraft.day3;

import java.util.Scanner;

public class StudentInfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your firstName: ");
		String firstName = in.next();
		
		System.out.println("Enter your LastName");
		String lastName = in.next();
		
		System.out.println("Enter your age: ");
		int age = in.nextInt();
		
		System.out.println("Enter your Salary: ");
		double salary = in.nextDouble();
		
		System.out.println("Enter your Bonus: ");
		double bonus = in.nextDouble();
		
		double totalSalary = salary + bonus;

		System.out.println("Student FirstName: "+ firstName);
		System.out.println("Student LastName: " +lastName);
		System.out.println("Student Age: " + age);
		System.out.println("Student Salary: " + salary);
		System.out.println("Student Bonus: " + bonus);
		System.out.println("Student Total salary: " + totalSalary);
	}

}
