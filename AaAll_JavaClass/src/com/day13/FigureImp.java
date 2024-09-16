package com.day13;
abstract class Figure{
	abstract void calcArea(double length);
}
class Bereket extends Figure{
	void calcArea(double length) {
	double Area= length *length;
	System.out.println(Area);
}
}


public class FigureImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Figure var1= new Bereket();
		var1.calcArea(20);
	}

}
