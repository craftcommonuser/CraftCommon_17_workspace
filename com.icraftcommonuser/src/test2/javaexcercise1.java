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
	    
	    System.out.println("Enter your Department: ");
		String department = in.next();
		
	
		System.out.println("Enter your ID");	
		String Id = in.next();
		
		
		
		
		System.out.println("Student FirstName:"+ " " + firstName);
		System.out.println("Student LastName: " + " " + lastname);
		System.out.println("Student Age: " + " " + age);
		System.out.println("Student Salary: " + " " + salary);
		System.out.println("Student Department: " + " " + department);
		System.out.println("Enter your ID:"+ " " + Id);
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		    // ask the user for input
		    System.out.print("Enter your first name: ");
		    String input = sc.nextLine();
		    
		 // do something with input

		    // ask the user if they want to enter more information
		    System.out.print("Do you want to enter more information? (yes/no): ");
		    String choice = sc.nextLine();
		    if(!choice.equalsIgnoreCase("yes")) {
		        break;
		    
		    }
		}
		
	

		
	}

}
