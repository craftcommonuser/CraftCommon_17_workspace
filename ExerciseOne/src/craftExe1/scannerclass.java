package craftExe1;
import java.util.Scanner;
import java.lang.*;


public class scannerclass {
	
	
	public static void main(String args) {
		
		Scanner ax = new Scanner(System.in);
	
	 /*String name = "Frist Name";
	 int age = 2;
	 double salary ;
	 char gender;
	 */
		while(true) {
		
		 String name = ax.next();		
	 System.out.println("my first name is:"+ name);
	
	 
	
	 int age = ax.nextInt();
	 System.out.println("my age:"+ age);
	 
	 double salary = ax.nextDouble();
	 System.out.println("my salary:"+ salary);
	 
	 String gender = ax.next();
	 System.out.println("my gender is:"+ gender);
	 
	
		}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	}

}
