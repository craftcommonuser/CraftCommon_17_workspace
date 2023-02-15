package com.icraftjava;

public class BreakDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		do {
			if (i == 6) {
				i++;
				break;

			}
			System.out.println(i);
			i++;
		} while (i <= 20);

	}
}
