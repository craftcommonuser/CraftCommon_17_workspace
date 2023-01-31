package example;

import java.util.Scanner;

public class example_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("pls enter your first name:");
		String name1 = in.nextLine();
		System.out.println("pls enter your last name :");
		String name2 = in.nextLine();
		System.out.println("pls enter your Salary:");
		int salary = in.nextInt();
		System.out.println("pls enter your Bonus:");
		double bonus = in.nextDouble();
		
		
		System.out.println("The full name is : " + name1 + " " + name2);

		System.out.println("The Salary is : " +  salary);

		System.out.println("The Bouns is : " + bonus);

		System.out.println("the total salary is : " + salary + bonus);
	}
}
	

	
