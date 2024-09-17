package com.icraft.day4;

public class LocalVariableDemo {
	    
	public void methodone() {
		int j = 25; // <-------------- local variable 
		System.out.println("Value of j: " + j); //25
	}
	
	public void methodtwo() {
		int k = 30; //<------------- local variable 
		System.out.println("Value of k: " + k); // 30
//		System.out.println("Value of j: " + j); //25
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LocalVariableDemo var = new LocalVariableDemo();
        var.methodone();
        var.methodtwo();
	}

}
