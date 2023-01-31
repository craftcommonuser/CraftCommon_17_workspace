package methodDemo2;

public class BoxWithParameters {

	public double calcVolume(double width, double height, double depth) {
		double volume = width * height * depth;
		return volume;
	}
	
	public static void main(String[] args) {
		
	BoxWithParameters mybox = new BoxWithParameters();
	double vBox = mybox.calcVolume(10,20,30);
     System.out.println("Volume of box is: " + vBox);
		
	
}
	
}


//Method call

//double returnVal = mybox.calcVolume();
//The righthand side is the method you call.
//The lefthand side is value returned by the method.