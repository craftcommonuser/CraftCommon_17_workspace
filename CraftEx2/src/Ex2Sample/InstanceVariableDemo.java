package Ex2Sample;

public class InstanceVariableDemo {
	int age = 25; // <----InstanceVariablea Declared outside methods
int age2= 30;
int age3 = 1;
  
	public void methodone() {
		int i = 10; // local variable
	
		System.out.println("Value of i:" + i);
		System.out.println("Value of  age:" + age);
		System.out.println("Value of  age:" +  (age2 +=  age3));
	}

	public void methodtwo() {
		int k = 30; // local variable
		System.out.println("Value of k:" + k);
		System.out.println("Value of  age:" + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariableDemo var = new InstanceVariableDemo();
		var.methodone();
		var.methodtwo();
		var.incrementDecrement(); 
		
	}

	private void incrementDecrement() {
		
		//ex for increment and decrement 
		 // declare variables
	    int a = 12, b = 12;
	    int result1, result2;

	    // original value
	    System.out.println(a++);//12 ==== a=13
	    System.out.println(++a);//14
	    System.out.println(a--);//14
	    System.out.println(--a);//12
	  
	    for(int i=1; i<=5; i++) {
		  
	    	System.out.print(i);//12345
	   }
		
	}
}
