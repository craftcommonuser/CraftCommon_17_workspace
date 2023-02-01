package testApp1;

public class LocalVariable {
        int ID = 25;//instance variable

	public void methodone() {
		int age = 7; // local variable
		System.out.println("The age of buchi is:" + age);
		System.out.println("Value of ID: " + ID);
	
	}	
	public void methodtwo () {
		int k = 34;//local variable
		int age = 7;// local variable
		System.out.println("Value of k:" + k);
	    System.out.println("Value of age is " + age);
	    System.out.println("Value of ID " + ID);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalVariable local1 = new LocalVariable();
		local1.methodone();
		local1.methodtwo();
	}

}


