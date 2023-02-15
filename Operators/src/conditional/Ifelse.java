package conditional;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner hp = new Scanner(System.in);
		
		System.out.println("Enter your mark: ");
		double mark = hp.nextDouble();
		if (mark>75){
			System.out.println("First Division");
		}
		else {
			System.out.println("Second Division");
		
		}

	}

}
