package PolyandInhertiance;

class Animal1{
	void eat() {
		System.out.println("animal eating...");
		
	}
}

class Dog extends Animal1{
	void bark() {
		System.out.println("wof wof...");
	}
}
class BabyDog extends Dog{
	void drink() {
		System.out.println("Drink milk...");
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	BabyDog d = new BabyDog();
	d.drink();
	d.bark();
	d.eat();
	}
	

}
