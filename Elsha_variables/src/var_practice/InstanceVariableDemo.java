package var_practice;

public class InstanceVariableDemo {
	
	int age = 25; //InstanceVariablea Declared outside methods
	public void methodone() {
				int i = 10; // local variable 
				System.out.println("Value of i:" + i);
				System.out.println("Value of age:" + age);
	}
	public void methodtwo() {
				int K = 30;// local variable
				System.out.println("Value of k:" + K);
				System.out.println("Value of age:" + age);
	}
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		InstanceVariableDemo m1 = new InstanceVariableDemo();
		m1.methodone();
		m1.age = 27;
	//	m1.methodtwo();
		
		InstanceVariableDemo m2 = new InstanceVariableDemo();
		m2.methodone();
		m2.age = 30;
		
		InstanceVariableDemo m3 = new InstanceVariableDemo();
		m3.methodone();
		
		InstanceVariableDemo m4 = new InstanceVariableDemo();
		m4.methodone();
		
		InstanceVariableDemo m5 = new InstanceVariableDemo();
		
	}
}

