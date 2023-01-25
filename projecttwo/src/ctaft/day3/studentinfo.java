package ctaft.day3;

import java.util.Scanner;

public class studentinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your First Name: ");
		String firstName = input.next();
		
		System.out.println("Enter your Last Name: ");
		String lastName = input.next();
		
		System.out.println("Enter your Age: ");
		int Age = input.nextInt();
		
		

		
		System.out.println("Enter your Salary: ");
		Double salary = input.nextDouble();
		
		System.out.println("Enter your Bouns: ");
		Double Bouns = input.nextDouble();
		
		System.out.println("The full name is: " + firstName + " " + lastName);
		System.out.println("The Age is; " + Age);
		
		System.out.println("The Salary is : " + salary);
		System.out.println("The Bouns is:" + Bouns);
		
		System.out.println("print something");
		
	}

}
