
package scanner_inpute;

import java.util.Scanner;

	public class scanner {

		//my main method
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//Scanner in = new Scanner(System.in);
			Scanner ts = new Scanner(System.in);
			
			String n = "no";
			String interst = "yes";
			while(!interst.equalsIgnoreCase(n)) {
			
			System.out.println("Enter your first name");
			String firstName = ts.next();
			
			
			
			System.out.println("Enter your last name");
			String lastName = ts.next();
			
			
			System.out.println("Enter your age");
			int age = ts.nextInt();
			
			
			System.out.println("Enter your  salary");
			double salary = ts.nextDouble();
			
			
			System.out.println("Enter your bouns");
			double bonus = ts.nextDouble();
			
			
			System.out.println("Enter total salary");
			double totalSalary = ts.nextDouble();
			
			System.out.println("Do you want to continue? Say yes/no");	
			interst = ts.next();
			
			
			System.out.println("First Name : " + firstName);
			System.out.println("Last Name : " + lastName);
			System.out.println("Age: " + age);
			System.out.println("Salary: " + salary);
			System.out.println("Bonus: " + bonus);
			System.out.println("Student total salary: "+ totalSalary);
			System.out.println("LETS DO IT 1 MORE TIME!");
			System.out.println();
			
		    
			}	
		 ts.close();
		 System.out.println("Exit");
		
		}
			
		}

	



