package customer1;

import java.util.Scanner;

public class coustomerinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// my object name sc
				Scanner input =new Scanner(System.in);
				
				String choice = "y";
				while(!choice.equalsIgnoreCase("n")) {
			
				
		
		System.out.println("Enter your first name");
        String firstname = input.next();
        
        System.out.println("Enter your last name:");
        String lastname = input.next();
        
        System.out.println("Enter your age:");
        int age = input.nextInt();
        
        System.out.println("Enter your gender:");
        String gender = input.next();
        
        System.out.println("Enter your salary:");
        double salary = input.nextDouble();
        
        System.out.println("Enter your bonus:");
        double bonus = input.nextDouble();
        
        double totalSalary = salary + bonus;
      //if we want to continue enter another data choice y or to stop choice n
      		System.out.print("Continue? (y/n)");
      		choice =input.next();

        
        System.out.println("student firstname:" + firstname);
        System.out.println("student lastname:" + lastname);
        System.out.println("student age:" + age);
        System.out.println("student gender:" + gender);
        System.out.println("student salary:" + salary);
        System.out.println("student bonus:" + bonus);
        System.out.println("student totalSalary:" + totalSalary);
        System.out.println();
        
      
      
        
        
				}
				
		input.close();
				System.out.println("Bye");

}
		
		

	}

