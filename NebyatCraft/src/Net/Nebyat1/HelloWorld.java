package Net.Nebyat1;

import java.util.Scanner;

public class HelloWorld {

	private static final String LastNaem = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your firsName:");
		String firstName = in.next();
		
		System.out.println("Enter your LastName:");
		String lastName = in.next();
		
		System.out.println("Enter your age:");
		int age = in.nextInt();
		
		System.out.println("Enter your Salary:");
		double salary = in.nextDouble();
		
		System.out.println("Enter your bonnes:");
		double bonnes = in.nextDouble();
		
		double totalsalary = salary + bonnes;
		System.out.println("this is firstName:"+firstName);
		System.out.println("this is lastName:"+lastName);
		System.out.println("my Age:"+age);
		System.out.println(" my salary:"+salary);
		System.out.println("my bonnse:"+bonnes);
		System.out.println("my total salary:" + totalsalary);
		
		
		
		
		
		

	}

}