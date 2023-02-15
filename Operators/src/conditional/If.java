package conditional;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		int num = input.nextInt();
		System.out.println("Please enter any positive number between 1 and 99999");
		
		if(num < 10 && num >=1) {
			System.out.println("Its a one digit number");
		}else if (num < 100 && num >=10) {
			System.out.println("Its a Two digit number");
		}else if (num < 1000 && num >=100) {
			System.out.println("Its a Three digit number");
		}else if (num < 10000 && num >=1000) {
			System.out.println("Its a Four digit number");
		}else if (num < 100000 && num >=10000) {
			System.out.println("Its a Five digit number");
		}
		else {
			System.out.println("number is not betwen 1 && 99999");
			
		}

	}

}
