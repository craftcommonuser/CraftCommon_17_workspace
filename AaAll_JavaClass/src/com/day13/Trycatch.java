package com.day13;

public class Trycatch {

	 public static void main(String[] args) {

		    try {

		      // code that generate exception
		      int divideByZero = 5 / 7;
		      System.out.println("Rest of code in try block" + divideByZero);
		    }
		    
		    catch (ArithmeticException c) {
		      System.out.println("ArithmeticException => " + c.getMessage());
		    }
		  }
		}


