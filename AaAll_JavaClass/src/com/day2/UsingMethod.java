package com.day2;

public class UsingMethod {
	public static String name2 = "Elias";

	public void methodone() {
		int j = 5;
		name2= "Ber";
		System.out.printf("This is J: " + j + "%n");
		System.out.println("Enter fName : " + name2);

	}

	public void methodTwo() {
		int k = 4;
		int l = 5;
		int n = k + l;
		name2= "hana";
		
		System.out.printf("This is the value of %s   ", "sum  : " + n);
		System.out.println("Enter fName : " + name2);
	}

	public static void main(String[] args) {
		String name2 = "Bereket";
		// TODO Auto-generated method stub
		System.out.println("Enter fName of : " + name2);

		UsingMethod B = new UsingMethod();
		B.methodone();
		B.methodTwo();

	}

}
