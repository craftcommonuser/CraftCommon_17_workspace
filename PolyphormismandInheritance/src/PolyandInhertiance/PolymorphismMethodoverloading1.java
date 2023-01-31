package PolyandInhertiance;

class Adder{
	static int add(int a) {
		return a+a;
		
	}
	
	static double add(int a, int b) {
		return a+b;
		
	}
	
	static double add(double a, int b) {
		return a+b;
	}
	
	static double add(double a, double b) {
		return a+b;
	}
}

public class PolymorphismMethodoverloading1 {
	
	public static void main(String[] args) {
		
		System.out.print(Adder.add(10));
		System.out.print(Adder.add(10.5, 11.4));
	}

}
