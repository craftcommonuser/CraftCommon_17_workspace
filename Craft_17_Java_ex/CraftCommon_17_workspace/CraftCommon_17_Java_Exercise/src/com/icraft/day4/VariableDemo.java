package com.icraft.day4;

public class VariableDemo {
	//member variable 
// String studName; // declaration of a variable 
// studName= "Adam"; // initialization variable 
	
	String studName = "Jamie"; // instance variable 
	int studAge = 15; // instance variable 
	double studSalary = 200.98; // instance variable 
	static String studId = "CR-007"; // static variable 
	
	// methods
	public void show() {
		double studBonus = 100; // local variable 
		
		System.out.println("StudentNAME: " + studName); //
		System.out.println("StudentAGE: " + studAge); //
		System.out.println("StudentSalary: "+ studSalary); //
		System.out.println("StudentBonus: " + studBonus); //
		System.out.println("StudentId; " + studId); //
	}
	
	public static void main(String [] args) {
		
		
		VariableDemo v1 = new VariableDemo();
		v1.studName = "James";
		v1.show();
		
		
		
	}

}
