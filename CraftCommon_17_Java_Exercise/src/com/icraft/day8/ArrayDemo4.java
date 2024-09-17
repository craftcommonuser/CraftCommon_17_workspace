package com.icraft.day8;

public class ArrayDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] studMark = {87,77,90,100,80,66,58,84,81,100};
		
		calcMark(studMark);
	}

	private static void calcMark(double[] mark) {
		// TODO Auto-generated method stub
		
		double total = 0;
		double avg;
		
		// for-loop
		for (int i = 0; i< mark.length; i++) {
			total = total + mark[i];
		}
		
		avg = total / mark.length;
		
		System.out.println("Student total mark: " + total);
		System.out.println("Student average mark: " + avg);
	}

}
