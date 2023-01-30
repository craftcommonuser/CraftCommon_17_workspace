package MethodOverridingandOverloading;

final class Bike{
	final int speedLimit = 90; //final aka constant
	final double pi = 3.14;
	
	void run() {
		 // speedLimt =100;
		//error because the value is final and can not override.
		System.out.print("Bike is running safely");
	}
}
class Honda extends Bike{  //error because class Bike is final
	void run() {
		System.out.print("Honda bike running safely with 100kmph");
}
public class finalDemo1 {

	public void main(String[] args) {
		// TODO Auto-generated method stub

		Bike obj = new Bike();
		obj.run();
	}

}

}


//super allows us to access the parent class before the override
