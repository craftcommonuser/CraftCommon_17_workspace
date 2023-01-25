package var_practice;

public class LocalVariableDemo {
	
	public void methodOne() {
		int j = 25; // Local variable 
		System.out.println("Value of j:" + j); //25
	}
		public void methodTwo() {
			int k = 30; // Local variable 
			System.out.println("Value of k:" +k); //30
// System.out.println("Value of j:" + j); // ---- Error
		}
		
		public static void main(String[] args) {
		
			 LocalVariableDemo m1 = new LocalVariableDemo(); // Creating an object 
			
			m1.methodOne();
			m1.methodTwo();
		}
	}


