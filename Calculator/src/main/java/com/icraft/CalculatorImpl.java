package com.icraft;

public class CalculatorImpl implements Calculator {
	

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	public int multi(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public double div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	public static void main(String args) {
		
		Calculator calc = new CalculatorImpl();
		
		System.out.println("Addition "+ calc.add(10, 10));
		System.out.println("Multiplication "+ calc.multi(10, 10));
		System.out.println("Subtraction "+ calc.sub(10, 10));
		System.out.println("Division "+ calc.div(10, 10));
	}
	  	

}
