package com.icraft.day8;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		String empName[] = new String [10]; //index 0-9
		empName[0] = "Jamie";
		empName[1] = "James";
		empName[2] = "Adam";
		empName[3] = "Daniel";
		empName[9] = "lucy";
		
//		System.out.println(empName[0]);
//		System.out.println(empName[1]);
//		System.out.println(empName[2]);
//		System.out.println(empName[3]);
//		System.out.println(empName[9]);
		 
		//for-each statements
		for(String elt:empName) {
			System.out.println(elt + " ");
		}
		
		System.out.println();
		
		//for-loop statements
		for(int i=0; i<10; i++) { 
			System.out.println(empName[i] + " ");
		}
	}

}
