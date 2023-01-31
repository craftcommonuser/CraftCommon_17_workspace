package com;

import java.util.Scanner;

public class EmployeeInfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Please enter your name:");
		String empName = in.next();
		System.out.println("Please enter age:");
		int empAge = in.nextInt();
		System.out.println("Please enter your salary:");
		double empSalary = in.nextDouble();
		System.out.println("Please enter your Bonus:");
		double empBonus = in.nextDouble();
		System.out.println("Please enter your totalsalary:");
		double totalSalary = in.nextDouble();
		
		System.out.println("EmployeeName:" + empName);
		System.out.println("EmployeeAge:" + empAge);
		System.out.println("EmployeeSalary:" + empSalary);
		System.out.println("EmployeeBonus:" + empBonus);
		System.out.println("EmployeeTotal Salary:" + totalSalary);
	}
}
