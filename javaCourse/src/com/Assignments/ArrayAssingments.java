package com.Assignments;

import java.util.Arrays;
import java.util.Collections;

public class ArrayAssingments {

	public static void main(String[] args) {
		// create a program using arrays for integers in descending order
		
		Integer [] num = {106,26, 81,05, 15 };
			Arrays.sort(num,Collections.reverseOrder());
			
			System.out.println(Arrays.toString(num));
		}
	

}
