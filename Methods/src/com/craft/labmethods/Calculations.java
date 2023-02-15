package com.craft.labmethods;

public class Calculations {
	int addTwoNumbers(int num1, int num2, int num3) {
		return num1 + num2;
	}

	void displayName(String name) {
		System.out.println(" YOur name is:" + name);
	}

	public static void main(String[] args) {
		Calculations calc1 = new Calculations();
		Calculations calc2 = new Calculations();
		int result = calc1.addTwoNumbers(3,5,5);

		calc1.displayName("Johns");
		calc1.displayName("Tamerat");

		System.out.println(calc1.addTwoNumbers(3,5, 5));
	}

}
