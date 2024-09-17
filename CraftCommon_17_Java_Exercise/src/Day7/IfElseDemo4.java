package Day7;

import java.util.Scanner;

public class IfElseDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ente Student Mark:");
		double mark = in.nextDouble();
		String Grade;
		
		if (mark >=90 && mark <=100) {
			Grade = "A+";
			
		}
		else if(mark >=85 && mark<90) {
			Grade = "A";
		}
		else if(mark >=80 && mark <85) {
			Grade ="A-";
				
		}
		else if(mark >=70 && mark <80) {
			Grade = "B";
			
		}
		else if(mark >=60 && mark <70) {
			Grade = "C";
			
		}
		else if(mark >=50 && mark <60) {
			Grade = "D";
			
		}
		else {
			Grade = "F";
		}

	}

}
