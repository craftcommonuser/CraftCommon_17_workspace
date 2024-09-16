package com.day13;

/*interface Polygon {
  void getArea(int length, int breadth);
}
*/
// implement the Polygon interface
class Rectangle implements Polygon {

  // implementation of abstract method
  public void getArea(int length, int breadth) {
    System.out.println("The area of the rectangle is " + (length * breadth));
  }

@Override
public void getLength(int a, int b) {
	// TODO Auto-generated method stub
	int c= a+b;
	System.out.println("The length is : " + c);
	
}

@Override
public void getName(String name) {
	// TODO Auto-generated method stub
	System.out.println("The name is : " + name);
	
}

@Override
public void getLname(String lname) {
	// TODO Auto-generated method stub
	System.out.println("This is LastName : "+lname);
	
}

}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Rectangle r1 = new Rectangle();
		    r1.getArea(5, 6);
		    r1.getLength(20, 30);
		    r1.getName("Bereket");
		    r1.getLname("Elias");
		  }

	}


