package PolyandInhertiance;
		//using constructors 
class Box {
	
	double width;
	double height;
	double depth;
	
	Box() {
		width = 10;
		height = 12;
		depth = 20;
	}
	
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
		
	}
	
	double volume() {
		return width * height * depth;
		
	}
}
public class Polymorphismmethodoverloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b1 = new Box();
		
		System.out.println(b1.volume());
		
		Box b2 = new Box(20,20,20);
		System.out.println(b2.volume());
	}

}
