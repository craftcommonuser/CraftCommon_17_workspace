package craft.scan;

import java.util.Scanner;

public class Module2 {

	public static void main(String[] arg) {
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
		double totalSalary = salary + bonus;

	}
}