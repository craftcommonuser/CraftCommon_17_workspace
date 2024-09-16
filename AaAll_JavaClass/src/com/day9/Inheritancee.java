package com.day9;
class calc{
	int a;
	public void additon(int x, int y) {
		a= x+y;
		System.out.println(a);
		
	}
	public void subtraction(int b, int c) {
		a= b-c;
		System.out.println(a);
	}
}




public class Inheritancee extends calc{
	public void multiplication(int g, int h) {
		a= g*h;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  n=6;
		calc ne= new calc();
		ne.additon(n, 4);
		}

}
