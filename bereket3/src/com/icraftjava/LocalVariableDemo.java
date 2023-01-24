package com.icraftjava;

public class LocalVariableDemo {
	public  static int a = 7;
	public void methodone() {
		int j = 25;
		System.out.println(j);
		System.out.println(a);
	}
	public void methodtwo() {
		int k = 30;
		int a = 40;
		int f = k%a;
		System.out.println(f);
		//System.out.println(j);
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the result");
		//System.out.println(a);
		LocalVariableDemo ber = new LocalVariableDemo ();
		ber.methodtwo();
		ber.methodone();
		

	}

}
