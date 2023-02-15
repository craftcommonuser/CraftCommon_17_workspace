package com.day7.array;

public class ArrayDemo1 {

	public static void main(String[] args) {

		int[] ageOfStudent = new int[88];// index from 0-87

		ageOfStudent[0] = 30;
		ageOfStudent[1] = 31;
		ageOfStudent[2] = 32;
		ageOfStudent[3] = 20;
		ageOfStudent[4] = 21;
		
		
//		System.out.println(ageOfStudent[0]);
//		System.out.println(ageOfStudent[1]);
//		System.out.println(ageOfStudent[2]);
//		System.out.println(ageOfStudent[3]);
//		System.out.println(ageOfStudent[4]);
        
		/*for each statement
		 * Syntax for (datatype varName: arrayName)[
		 * System.out.println(varName);
		 */
		for(int elt: ageOfStudent){
	       System.out.print(elt + " ");
	       
	       //for-loop statements
	
		}
	}
}
