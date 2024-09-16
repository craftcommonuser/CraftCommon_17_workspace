package Day7;

import java.util.Scanner;

public class IfElseAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner in = new Scanner(System.in);
		
		System.out.println("Ente Student Mark: ");
		double mark = in.nextDouble();
		
		if(mark > 85) {
			System.out.println("First Division");
		}

		else {
			System.out.println("Second Division");
		}
	

		System.out.println("outside if  else");
	}
}	

