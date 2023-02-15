package com.day6;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Expresion = "Bereket";
		switch(Expresion) {
		case "Hello":
			Expresion = "Hello";
			break;
		case "hi":
			Expresion = "hi";
		default:
			Expresion ="no statement";
			break;
		}
		System.out.println(Expresion);
	}

}
