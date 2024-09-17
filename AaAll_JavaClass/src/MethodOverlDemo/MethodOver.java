package MethodOverlDemo;

public class MethodOver {
	
	public double calcArea(int a, int b) {
		double result= a * b;
		return result;
		
	}
	public double calcArea(double a, double b) {
		double result1= a * b;
		return result1;
	}
	public int calcArea(int a, int b, int c) {
		int volume= a * b * c;
		return volume;
		
	}
	public int calcArea(int d) {
		int Carea= 3 * d * d;
		return Carea;
	}

}
