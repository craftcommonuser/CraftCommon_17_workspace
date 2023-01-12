package Ex2Sample;

import java.util.Scanner;

public class StudentInfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // my object name sc
		Scanner sc =new Scanner(System.in);
		
		String choice = "y";
		while(!choice.equalsIgnoreCase("n")) {
	
		System.out.println("Enter First name:");
		String firstName=sc.next();
		
		System.out.println("Enter Last Name: " );
		String lastName =sc.next();
		
		System.out.println("Enter Age: " );
		int age= sc.nextInt();
		
		System.out.println("Enter Salary: " );
		double salary = sc.nextDouble();
		
		System.out.println("Enter bonus: " );
		double bonus = sc.nextDouble();
		
		double totalSalary = salary + bonus;
		
		//if we want to continue enter another data choice y or to stop choice n
		System.out.print("Continue? (y/n)");
		choice =sc.next();
		System.out.println();
		
		//our out put
		
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name : " + lastName);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		System.out.println("Bonus: " + bonus);
		System.out.println("Student total salary: "+ totalSalary);
		
	
	
		}
		
		sc.close();
		System.out.println("Bye");
	}

}
