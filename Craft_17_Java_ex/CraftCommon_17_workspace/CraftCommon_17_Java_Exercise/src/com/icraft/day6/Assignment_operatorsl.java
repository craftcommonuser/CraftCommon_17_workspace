package com.icraft.day6;

public class Assignment_operatorsl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a = 30;
           int b = 10;
           int c = 0;
           c = a + b;
           System.out.println("c = a+ b = " + c); //40
           c +=a; // c = c+a= 40+30 
           System.out.println("c += a = " + c); // 70
           c -= a; //c = c-a= 70-30 
           System.out.println("c -= a = " + c);// 40
           c *=a; //c =c*a=40*30
           System.out.println("c *= a = " + c); //1200
           a = 20;
           c = 25;
           c %= a; // c =c%a= 25%20
           System.out.println("c %= a = " + c); //5
           	   
	}

}
