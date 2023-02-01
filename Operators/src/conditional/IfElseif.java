package conditional;

import java.util.Scanner;

public class IfElseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your mark: ");
		double mark = in.nextDouble();
		
		String Grade;
		
		if (mark <=100 && mark>=90) {
			Grade = "A+";
		if (mark <=90 && mark >=80) {
			Grade = "A";
		if (mark <=80 && mark >=70) {
			Grade = "B";
		if (mark <=70 && mark >=60) {
			Grade = "C";
		}
		
		}
		}
		}
			

	}

}
