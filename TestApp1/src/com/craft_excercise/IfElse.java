package com.craft_excercise;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
System.out.println("enter student mark: ");
double mark = in.nextDouble();
if (mark > 85) {
	System.out.println("first division");
}
else {
	System.out.println("second division");
}
	}

}
