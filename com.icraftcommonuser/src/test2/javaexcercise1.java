package test2;

import java.util.Scanner;

// creating class
public class javaexcercise1 {
 // my main method
	public static void main(String[] args) {
	

		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter Your FirstName:");
		String firstName = in.next();
		
		System.out.println("Enter Your LastName");
		String lastname = in.next();
		
		System.out.print("Enter Your Age");
		int age = in.nextInt();
		
	    System.out.print("Enter Your Salary");
	    Double salary = in.nextDouble();
	    
	    System.out.println("Enter your Bonus: ");
		double bonus = in.nextDouble();
		System.out.println("Enter your total");
		double total = in.nextDouble();
		
		
		
		
		
		System.out.println("Student FirstName:"+ firstName);
		System.out.println("Student LastName:" + lastname);
		System.out.println("Student Age:" + age);
		System.out.println("Student Salary:" + salary);
		System.out.println("Student Bonus:" + bonus);
	
		

		

		
	}

}
