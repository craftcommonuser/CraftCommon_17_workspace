package com.staticDemo;

public class EmployeeInfo {
	
	static String myname = "Daniel Kafele"; //static variable
	static int age = 24; //static variable
	int salary = 20000; //instance
	
public static void getEmpDetails() {
	
	System.out.print("Name: " + myname);
	System.out.print("Age: " + age);	
}

	public void printEmpDetails() {

		System.out.print("Name: " + myname);
		System.out.print("Age: " + age);
		System.out.print("Salary: " +  salary);
	}

}
