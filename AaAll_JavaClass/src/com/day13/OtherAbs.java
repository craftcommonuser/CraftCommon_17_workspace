package com.day13;

abstract class A{
	
	abstract void callme();
   
	
	void callmetoo() {
		System.out.println("This is Concrete Meth");
	}

	
	
}

class B extends A{
	void callme(){
		System.out.println("implementation");
		
	}
}

public class OtherAbs {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	A c= new B();
	c.callme();
	c.callmetoo();

	}

}
