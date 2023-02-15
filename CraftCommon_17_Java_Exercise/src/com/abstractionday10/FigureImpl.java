package com.abstractionday10;

//concrete class
public class FigureImpl extends Figure{

	@Override
	public void calcArea(int length) {
		// TODO Auto-generated method stub
		int result = length * length;
		System.out.println("Area of rectangle: " + result);
		
	}

}
