package com.day3;

public  class figureImpl extends figure {
// concrete method 
	@Override
	public void calcArea(int length) {
		// TODO Auto-generated method stub
		int result = length *length;
		System.out .println("Area of Rectangel: " + result);
	}

}
