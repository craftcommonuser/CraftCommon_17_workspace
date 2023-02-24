package customer1;

import java.util.Scanner;
public class Trial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
addition();
System.out.println("Addition Ended");
subtraction();
System.out.println("Subtraction Ended");
multiplication();
System.out.println("Multiplication Ended");
division();
System.out.println("Division Ended");
remainder();
System.out.println("Remainder Ended");
	}

	public static void addition()
	{Scanner input = new Scanner(System.in);
	int a, b, sum;
	
	System.out.println("Enter the first number !");
	a = input.nextInt();
	System.out.println("Enter the second number !");
	b = input.nextInt();
	sum = a + b;
	System.out.printf("The sum of a and b %d%n", sum);
	 
	}

	public static void subtraction()
	{Scanner input = new Scanner(System.in);
	int a, b, d;
	
	System.out.println("Enter the first number !");
	a = input.nextInt();
	System.out.println("Enter the second number !");
	b = input.nextInt();
	d = a - b;
	System.out.printf("The difference of a and b %d%n", d);
	 
	}
	public static void multiplication()
	{Scanner input = new Scanner(System.in);
	int a, b, p;
	
	System.out.println("Enter the first number !");
	a = input.nextInt();
	System.out.println("Enter the second number !");
	b = input.nextInt();
	p = a * b;
	System.out.printf("The product of a and b %d%n", p);
	 
	}
	public static void division()
	{Scanner input = new Scanner(System.in);
	int a, b, q;
	
	System.out.println("Enter the first number !");
	a = input.nextInt();
	System.out.println("Enter the second number !");
	b = input.nextInt();
	q = a / b;
	System.out.printf("The quotient of a and b %d%n", q);
	 
	}
	public static void remainder()
	{Scanner input = new Scanner(System.in);
	int a, b, r;
	
	System.out.println("Enter the first number !");
	a = input.nextInt();
	System.out.println("Enter the second number !");
	b = input.nextInt();
	r = a % b;
	System.out.printf("The remainder of a and b %d%n", r);
	 
	}
}
