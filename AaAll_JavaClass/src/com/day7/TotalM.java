package com.day7;

public class TotalM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] smark= {50, 70, 60,90};
		calcTotal(smark);
	}
	public static void calcTotal(int[] marks) {
		int total=0;
		for(int i=0; i<marks.length; i++) {
			total= total +marks[i];
		}
		System.out.println(total);
	}
	}
		
