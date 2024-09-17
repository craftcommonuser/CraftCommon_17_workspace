package com.icraft.day8;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
	
		
		double[] studMark = { 87, 77, 90, 100, 80, 66, 58, 84, 81, 100};
		
		//for-loop 
		for(int i=0; i<studMark.length; i++) {
			System.out.print(studMark[i] + " ");
			
		}
		
		System.out.println();
		
		//for-each
		for(double val: studMark) {
			System.out.print(val + " ");
		}
		
		System.out.println();
		
		
		//while-loop
		int k=0;
		while(k<studMark.length) {
			System.out.print(studMark[k] + " ");
			k++;
		}
	}

}
