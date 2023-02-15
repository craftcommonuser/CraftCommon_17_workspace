package com.day13;


interface Polyg{
  void getAlength();
  void getArea();

  // default method 
  default void getSides() {
    System.out.println("I can get sides of a polygon.");
  }
}

// implements the interface
class Rectangl implements Polyg {
  public void getArea() {
    int length = 6;
    int breadth = 5;
    int area = length * breadth;
    System.out.println("The area of the rectangle is " + area);
  }

  // overrides the getSides()
  public void getSides() {
    System.out.println("I have 4 sides.");
  }

@Override
public void getAlength() {
	// TODO Auto-generated method stub
	int width= 10;
	System.out.println("This is Alength : " + width);
	
}
}

// implements the interface
class Square implements Polyg {
  public void getArea() {
    int length = 5;
    int area = length * length;
    System.out.println("The area of the square is " + area);
  }

@Override
public void getAlength() {
	// TODO Auto-generated method stub
	int height= 100;
	System.out.println("This is height : " + height);
	
}
}
class OtherInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangl r1 = new Rectangl();
	    r1.getArea();
	    r1.getSides();
	    r1.getAlength();

	    // create an object of Square
	    Square s1 = new Square();
	    s1.getArea();
	    s1.getSides();
	    s1.getAlength();
	  }

	}


