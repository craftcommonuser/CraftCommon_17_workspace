package com.icraft;

public class CalculatorImpl implements Calculator {
	
		
	

	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public int subtruction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
public static void main (String[]args) {
Calculator calc = new CalculatorImpl();
System.out.println("Addition "  + calc.addition(10,10));
System.out.println("Subtruction " + calc.subtruction(10,10));
System.out.println("Division " + calc.division(10,10));
System.out.println("Multiplication " + calc.multiplication(10,10));

	}
}
	

