package Testtwo;
import java.util.Scanner;


public class Studentinfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter your FrstName: ");
		
		String FirstName = in.next();
		
		System.out.println("Enter your LastName");
		
		String LastName = in.next();
		
		System.out.println("Enter your age");
		
		int age = in.nextInt();
		
		System.out.println("Enter your salary");
		
		double salary = in.nextDouble();
		
		System.out.println("Enter your Bonus");
		
		double Bonus = in.nextDouble();
		
		System.out.println("Enter your totalsalary");
		
		double totalsalary = salary + Bonus;
		
		System.out.println("Student FirstName:" + FirstName);
		
		System.out.println("Student LasName:" + LastName);
		
		
		System.out.println("Student age:" + age);
		
		
		System.out.println("Student salary:" + salary);
		
		
		System.out.println("Student Bonus:" + Bonus);
		
		
		System.out.println("Student totalsalary:" +totalsalary);
		
		 
		 
		
		

	}

}
