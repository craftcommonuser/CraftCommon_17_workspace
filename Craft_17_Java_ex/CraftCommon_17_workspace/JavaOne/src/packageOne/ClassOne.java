package packageOne;

import java.util.Scanner;

public class ClassOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your firstName:");
		String firstName = in.next();
		System.out.println("Enter your lastName:");
		String lastName = in.next();
		System.out.println("Enter your age:");
		int age = in.nextInt();
		System.out.println("Enter your salary:");
		double salary = in.nextDouble();
		System.out.println("Enter your bonus:");
		double bonus = in.nextDouble();
		System.out.println("Enter your total salary:");
		double totalSalary = salary + bonus;
		double totalSalary1 = in.nextDouble();

	}
}