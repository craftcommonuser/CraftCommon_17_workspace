package com.day9;


public class OverloadCla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		box m = new box(2, 6, 7);
		m.volume();
		System.out.println(m.volume());
		box m1= new box(3,5,7);
		m1.volume();
		System.out.println(m1.volume());

	}

}
