package com.craft_excercise;

public class Challenge_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]numSort = new int[]{106,81,26, 15, 5};
		int temp;
		for(int i=0; i<numSort.length;i++) {
			for (int j=i; j<numSort.length; j++);{
			if(numSort[i]<numSort[j]) {
			temp = numSort[i];
				numSort[i]= numSort[j];
				numSort[j]= temp;
			}
		}
}
	for(int a:numSort)
	{
		System.out.println(a);
	}
}}
