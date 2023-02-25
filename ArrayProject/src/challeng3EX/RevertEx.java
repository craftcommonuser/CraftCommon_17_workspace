package challeng3EX;
//challenge #3
public class RevertEx {

	public static void reverse() {
		int revArray [] = {55,99,88,80,66};
		
		//print the array 
				System.out.println("The first array value");
				System.out.print("{");
		for(int i=0; i< revArray.length; i++) {
		System.out.print(revArray[i] + ",");
		}
				System.out.println("}");
				// print array revert value
				System.out.println("------------------------");
				System.out.println("The revert array value");
				System.out.print("{");
		for(int i=revArray.length-1; i>= 0; i--) {
			System.out.print(revArray[i] + ",");
			}
				System.out.println("}");
				int temp;
				System.out.println("------------------------");
				
				System.out.println("Desending sorted value");
		for(int i=0; i < 5; i++) {
			for(int j=i+1; j<5; j++) {
				
				if (revArray[i] < revArray[j]) {  
				temp = revArray[i];
				revArray[i]= revArray[j];
				revArray[j]=temp;
				}
			}
		
		}
	
		for(int i=0; i<5; i++) {
			System.out.print(revArray[i] + ",");
			}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RevertEx RA = new RevertEx(); // create object
		reverse(); //calling the revert method
		
	}

}
