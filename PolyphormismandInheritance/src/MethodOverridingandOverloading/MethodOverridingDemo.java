package MethodOverridingandOverloading;

class vehicle {
	
	void run() {
		System.out.println("vehicle is running");
		
	}
}

class Bike extends vehicle{
	
	void run() {
	System.out.println("Bike is running");
	
}
public class MethodOverridingDemo {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b1 = new Bike();
		b1.run();
		
	}

}

}