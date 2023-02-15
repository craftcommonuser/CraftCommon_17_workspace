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

	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}	
	public static void main(String[]args) {	
		Calculator calc=new CalculatorImpl();
		System.out.println("Addition "+ calc.add(10, 10));
		System.out.println("multiplication "+ calc.multi(10, 10));
		System.out.println("subtruction "+ calc.sub(10, 10));
		System.out.println("division "+ calc.div(10, 10));

	}
	}




