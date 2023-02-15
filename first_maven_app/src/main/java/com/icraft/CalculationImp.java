package com.icraft;

public class CalculationImp implements Calculator {

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new CalculationImp();
		
		System.out.println(calc.add(10, 10));
		System.out.println(calc.multi(10, 10));
		System.out.println(calc.sub(10, 10));
		System.out.println(calc.div(10, 10));
//		
		
//		
//		
}

	}


