package com.loop;

import java.util.Scanner;

public class Employeeinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner samri = new Scanner(System.in);
		  do {
		// TODO Auto-generated method stub
Scanner in =new Scanner (System.in);
System.out.println("pls enter your name:" );
String empName = in.next();
System.out.println("pls enter your LastName");
String empLastName = in.next();
System.out.println("pls enter your Age");
int empAge = in.nextInt();
System.out.println("pls enter your Salary");
double empSalary = in.nextDouble();
System.out.println("pls enter your Bonus");
double empBonus = in.nextDouble();
double ts = empSalary + empBonus;
System.out.println("Total Salary:"+ts);
System.out.println("Employe Name:"+ empName);
System.out.println("Employe LastName:"+ empLastName);
System.out.println("Employe Age:"+ empAge);
System.out.println("Employe Salary:"+ empSalary);
System.out.println("Employe Bonus:"+ empBonus);
//System.out.println("are you finish ? yes (1)or No (2) >>>");
//String weight = in.nextLine();

	 System.out.print("are you finish ? No 1 or Yes 2 >>>");
	
		   } while (samri.nextInt() == 1);
		  System.out.print("Thank you ");
	}
	
}
