package com.craft_excercise;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String empName[]= new String[10];
		empName[0]= "jimmy";
		empName[1]= "james";
		empName[2]= "daniel";
		empName[3]= "adem";
		empName[9]= "lucy";
		
		//System.out.println(empName[0]);
		//System.out.println(empName[1]);
		//System.out.println(empName[2]);
		//System.out.println(empName[3]);
		//System.out.println(empName[9]);
		
		//for each statement 
		//for (String elt: empName) {
			//System.out.print(elt + "");
		//
			for (int i=0; i<10;i++) {
				System.out.print(empName[i]+ "  ");
			}
		}
	}


