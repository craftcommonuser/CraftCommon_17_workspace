package MethodOverridingandOverloading;

final class Bike{
	final int speedLimit = 90;
	final double pi = 3.14;
	
	void run() {
		 // speedLimt =100;
		//error because the value is final and can not override.
		System.out.print("Bike is running safely");
	}
}
class Honda extends Bike{
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
