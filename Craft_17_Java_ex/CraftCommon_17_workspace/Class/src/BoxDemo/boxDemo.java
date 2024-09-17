package BoxDemo;

class Box {
	
		double width;
		double height;
		double depth;
		
}

public class boxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating an object 
		Box mybox = new Box();
		mybox.width = 10;
		mybox.height = 20;
		mybox.depth = 30;

		double volume;
		volume = mybox.width * mybox.height * mybox.depth;
		System.out.println("Volume of box is: " + volume);

	}

}
// to create a second Box
// Box myBox2 = new Box();
   //mybox2.width = 5;
   //mybox2.height = 8;
   //mybox2.depth = 10;