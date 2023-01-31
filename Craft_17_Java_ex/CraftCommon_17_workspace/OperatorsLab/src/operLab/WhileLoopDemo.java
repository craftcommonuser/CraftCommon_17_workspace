package operLab;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To write a code that will print a number from 1 to 50
		
		//using while loop
		int i = 1;
		
		while(i<=50) {
			
			System.out.print(i + " ");
			i++;
		}
		
		//using do while loop
		
		int j = 1;
		
		do {
			System.out.print(j + " ");
			j++;
		}while (j <=50);
			
		
		
		
		//for loop
	
			for(int k=1; k<=50; k++) {
				System.out.print(k + " ");
			}
			
	}
	
}

