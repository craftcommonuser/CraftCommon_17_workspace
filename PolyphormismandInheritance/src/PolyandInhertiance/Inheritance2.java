package PolyandInhertiance;

class Calculation{
	int x, y, z;
	
	public void addition(int x, int y) {
		z= x + y;
	System.out.println("The addition of x and y: " + z);
		
	}
	public void subtraction(int x, int y) {
		z = x - y;
		System.out.println("The subtraction of x and y: " + z);	
	}
}

class MyCalculation extends Calculation{
int x, y, z;
	
	
	
	public void muliplication(int x, int y) {
		z = x * y;
		System.out.println("The mutiplication of x and y: " + z);
		
		
	}
	
	public void Division(int x, int y) {
		z = x / y;
		System.out.println("The Division of x and y: " + z);
		}
}

public class Inheritance2 {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCalculation calc = new MyCalculation();
		
		calc.addition(10, 10);
		calc.subtraction(10,20);
		calc.muliplication (20,10);		
		calc.Division(10, 2);
		

	}
	
}



	