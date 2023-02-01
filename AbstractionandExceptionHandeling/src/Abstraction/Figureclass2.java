package Abstraction;
//concrete class
public class Figureclass2 extends Figure {  //provide implementation
// we can change this to abstract if it does not want to provide implementation
	@Override
	public void calcArea(int length) {
		// TODO Auto-generated method stub
		int result = length * length;
		System.out.println("Area of rectangle: "+ result);
		}



	}


