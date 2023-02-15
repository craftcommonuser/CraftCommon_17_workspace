package com.craft_excercise;

import java.util.Arrays;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arrContener = {50, 66, 3, 74, 12, 45, 6};
	    
		   Arrays.sort(arrContener); // sort by ascending

		   // print array value by descending
		   for(int i=arrContener.length-1; i>=0; i--) {
		    
		     System.out.print(arrContener[i] + " ");

		     
		   }
	}

}
