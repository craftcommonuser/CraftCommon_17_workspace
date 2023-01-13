package test1;

import java.util.Scanner;

public class javaintro {


public static void main (String [] args) {
	
	
	String name = "salem";
	String department = "IT";
	String status = "happy";
	
	System.out.println(name);
	System.out.println(department);
	System.out.println(status);
	
	
	System.out.println("Firstname:" + name);
	System.out.println("Department:" + department);
	System.out.println("Their status:" + status);
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter Your FirstName");
	String FirstName = in.next();
	System.out.print("Enter Your Department");
	String Department = in.next();
	System.out.print("Enter Your Status");
	String Status = in.next();
	
}
}
