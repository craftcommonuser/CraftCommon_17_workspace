package ctaft.day3;

public class viriableDemo {

	

			public void methodone() {
				int j = 35; // <---------- local variable
				System.out.println("Value of j:" + j);
			}

			public void methodtwo() {
				int k = 40; // <---------- local variable
				System.out.println("Value of k:" + k);
				// System.out.println("Value of j:" + j); // ← Error
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				viriableDemo var = new viriableDemo();
				var.methodone();
				var.methodtwo();
			}
		

		
	}


