package project11;

import java.util.Scanner;

public class FirstPmg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a Choise 1 to Continue or other number to Quite : ");
			int Choise = in.nextInt();
		
			if (Choise == 1) {
				System.out.println("Enter Your FirstName : ");
				String firstName = in.next();
				System.out.println("Enter Your LastName : ");
				String lastName = in.next();
				System.out.println("Enter Your Age : ");
				int age = in.nextInt();
				System.out.println("Enter Your Salary : ");
				double Salary = in.nextDouble();
				System.out.println("Enter Your Bonus : ");
				double Bonus = in.nextDouble();
				double totalSalary = Salary + Bonus;
				
				System.out.println("First Name : " + firstName);
				System.out.println("Last Name : " + lastName);
				System.out.println("age : " + age);
				System.out.println("Salary : " + Salary);
				System.out.println("Bonus: " + Bonus);
				System.out.println("And Total Salary is : " + totalSalary);
			
			}
			else {
				
				System.out.println("You done insertion, Bye ");
			
				break;
			}
		}
	}
}
		