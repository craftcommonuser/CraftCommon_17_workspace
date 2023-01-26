package MethodOverridingandOverloading;

class AreaCalculator {
	
	public double calcArea (double width, double length) { //method 1
		
		double rectArea = width * length;
		return rectArea;
	}
	
	public double calcArea (int rad) {   //method 2
		double CircleArea = 3.14 * rad * rad;
		return CircleArea;
	}
	
}

public class methodOverloadingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AreaCalculator calc = new AreaCalculator ();
		
		
		System.out.println("Rectangle area: " + calc.calcArea(10, 10));
		System.out.println("Circle Area: " + calc.calcArea(10));
	}

}


// classname.methodname
// double return1 = calc.calcArea;
// double return2 = calc.calcArea;