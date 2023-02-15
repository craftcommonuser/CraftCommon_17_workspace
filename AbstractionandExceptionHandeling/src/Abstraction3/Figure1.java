package Abstraction3;

public abstract class Figure1 {
	//field or variable declaration
	double dim1, dim2; //instance variables
	//constructor 
	public Figure1(double a, double b) {
		dim1 = a;
		dim2 = b;
	}
	
	//abstract method 
	public abstract double area();

}
