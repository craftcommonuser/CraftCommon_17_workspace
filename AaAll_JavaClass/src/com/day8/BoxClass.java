package com.day8;
class box {
	double width;
	double height;
	double depth;
}




	
	
public class BoxClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double volume;
		double area;
		box m1=new box();
		m1.width= 10;
		m1.height= 20;
		m1.depth= 25;
		volume= m1.width *m1.height *m1.depth;
		System.out.println("This is volume of square  " + volume);
		box m3 = new box();
		m3.width=2;
		m3.depth=3;
		area=m3.width* m3.depth;
		System.out.println("area of the second object   "+area);
		box2 m2=new box2();
		m2.width=5;
		m2.height=5;
		area= m2.width*m2.height;
		System.out.println("This is area of rectangle " + area);
		
		
	}

}
