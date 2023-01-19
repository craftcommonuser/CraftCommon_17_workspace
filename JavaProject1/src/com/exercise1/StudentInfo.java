//package com.exercise1;
//
//public class StudentInfo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		String firstName="Endashaw";
//		String lastName="Negatu";
//		int age=100;
//		double salary=200000.22;
//		double bonus=5000;
//		double totalSalary=salary+bonus;
//		
//	    System.out.println("Student Firstname:"+firstName);
//      System.out.println("Student lastname:"+lastName);
//		System.out.println("Student Age:"+age);
//		System.out.println("Student Salary:"+salary);
//		System.out.println("Student Bonus:"+bonus);
//		System.out.println("Student Totlasalary:"+totalSalary);
//		
//    }
//
//}

package com.exercise1;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inpute = new Scanner(System.in);
	
		System.out.println("Enter your firstName: ");
		String firstName = inpute.next();
		System.out.println("Enter your LastName");
		String lastName = inpute.next();
		System.out.println("Enter your age: ");
		int age = inpute.nextInt();
		System.out.println("Enter your Salary: ");
		double salary = inpute.nextDouble();
		System.out.println("Enter your Bonus: ");
		double bonus = inpute.nextDouble();
		System.out.println("Enter your TotlaSalary");
		double totalSalary = inpute.nextDouble();
		

System.out.println("Student Firstname:"+firstName);
System.out.println("Student LastName: " +lastName);
System.out.println("Student Age:"+age);
System.out.println("Student Salary:"+ salary);
System.out.println("Student Bonus:"+bonus);
System.out.println("Student Totlasalary:"+totalSalary);
	

	}
}
