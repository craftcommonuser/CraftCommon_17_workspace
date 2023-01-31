package com.icraft.day8;

public class ArryDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		double[] studMark = {87,77,90,100,80,66,58,84,81,100};
		double total =0;
		double average;
		
		//for-each
		for(double elt: studMark) {
			total =total + elt;
		}
		
		average = total/studMark.length;
		
		System.out.println("Student total mark: " + total);
		System.out.println("Student average mark: " + average);
		
	}

}
