package com.day7;

public class DoubleDim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mark= {{50,60,70},
				{50,40,30},
				{50},
				{40, 80,90,70,50}
		};
		for(int i=0; i<mark.length; i++) {
			
			for(int j=0; j<mark[i].length; j++) {
			
				System.out.print( mark[i][j] +  " ");
			}
			System.out.println( );
			
		}

	}

}
