package test2;

import java.util.Scanner;

// creating class
public class javaexcercise1 {
 // my main method
	
	

	
	public static void main(String[] args) {
	

		
		Scanner in = new Scanner(System.in);
		
		
		do {
		System.out.println("Enter Your FirstName:");
		String firstName = in.next();
		
		System.out.println("Enter Your LastName");
		String lastname = in.next();
		
		System.out.print("Enter Your Age");
		int age = in.nextInt();
		
	    System.out.print("Enter Your Salary");
	    Double salary = in.nextDouble();
	    
	    System.out.println("Enter your Department: ");
		String department = in.next();
		
	
		System.out.println("Enter your ID");	
		String Id = in.next();
		} while("keep entering more information "!= null);
		
		
		
		




		
		
	}

}
