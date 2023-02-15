package variablesJava;


public class InstancevariableDemo {

	int age = 25; // <----InstanceVariablea Declared outside methods

	public void methodone() {
		int i = 10; // local variable
		System.out.println("Value of i:" + i);
		System.out.println("Value of  age:" + age);
	}

	public void methodtwo() {
		int k = 30; // local variable
		System.out.println("Value of k:" + k);
		System.out.println("Value of  age:" + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 InstancevariableDemo var = new InstancevariableDemo();
			var.methodone();
			var.methodtwo();
		}
	}
