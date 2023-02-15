package MethodOverridingandOverloading;

public class SuperDemoAnimal {
		
		SuperDemoAnimal () {
			System.out.println("animal is created");
		}
		String color = "Black";
		
		public void eat () {
			System.out.println("Animal eats.....");
		}
	
		class Dog extends SuperDemoAnimal {
			Dog () {
				super();
				System.out.println("Dog is created");
			}
			String color = "White";
			
			public void sound () {
				System.out.println("bark bark....");
			}
			
		}
		
}

 