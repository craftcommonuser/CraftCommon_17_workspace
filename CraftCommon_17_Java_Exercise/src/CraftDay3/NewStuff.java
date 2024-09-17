package CraftDay3;

import java.util.Scanner;

public class NewStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner input = new Scanner (System.in);
		System.out.println("Enter Your First Name: ");
		String firstName = input.next();

		System.out.println("Enter Your Last Name: ");
		String lastName = input.next();
	
	    System.out.println("Enter Your Age: ");
	    int Age = input.nextInt();
	
	    System.out.println("EnterYour Gender: ");
	    String Gender = input.next();
	
	    System.out.println("Enter Your Salary: ");
	    Double Salary = input.nextDouble();
	
	    System.out.println("Enter Your Bonus: ");
	    Double Bonus = input.nextDouble();
	
	    System.out.println("The full name is: " + firstName + " " + lastName);
	    System.out.println("The Age is; " + Age);
	    System.out.println("The Gender is : " + Gender);
	    System.out.println("The Salary is : " + Salary);
	    System.out.println("The Bonus is: " + Bonus);
	    		
	}

}
