package com.day6;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 70;
		String size;

		switch (num1) {
		case 23:
			size = "midium";
			break;

		case 40:
			size = "large";
			break;

		default:
			size = "extra_large";
			break;

		}
		System.out.println(size);

	}

}
