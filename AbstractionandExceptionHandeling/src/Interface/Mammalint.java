package Interface;

public class Mammalint implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("mammalint eats...");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("mammalint travels...");

	}
	public int noOfLegs() {
		return 0;
	}

}
