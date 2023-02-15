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
	public static void main(String[]args) {
		
		Calculator Calc = new CalculatorImpl();
		
		System.out.println("addition "+ Calc.add(10, 10) );
	    System.out.println("multiplication "+ Calc.multi(10, 10) );
	    System.out.println("subtraction "+ Calc.sub(10, 10) );
       System.out.println("division "+ Calc.div(10, 10) );
}    
}