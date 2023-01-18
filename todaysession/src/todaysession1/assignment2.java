package todaysession1;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

assignment2 m1 = new assignment2();
		
		m1.methodOne();
		m1.methodTwo();
		
	}
		int age = 25;
		
		public void methodOne() {
		int i = 10;
		System.out.println("value of i: " + i); //10
		System.out.println("value of age: " + age); //25
		
		}
		public void methodTwo() {
			int k = 30;// -------- Local Variable
			System.out.println("value of k: " + k); //30
			int j = 20;// -------- Local Variable
			System.out.println("value of j: " + j); //20
			System.out.println("value of age: " + age); //25
			
			assignment2 b1 = new assignment2();
			age = 27;
			b1.methodOne();
			
			assignment2 b2 = new assignment2();
			age = 30;
			b2.methodOne();
			
			assignment2 b3 = new assignment2();
			b3.methodOne();
			
			assignment2 b4 = new assignment2();
			
			b1.methodOne();
			
			
			
	}

}
