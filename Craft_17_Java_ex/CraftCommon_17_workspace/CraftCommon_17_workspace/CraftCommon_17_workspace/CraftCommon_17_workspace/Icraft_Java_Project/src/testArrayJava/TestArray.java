package testArrayJava;

public class TestArray {

	public static void main(String[] args) {
		
	double[]myList = { 1.9, 2.9, 3.4, 3.5};
	
	//pritn all array elements
	for (int i = 0; i < myList.length; i++) {
	System.out.print(myList [i]+ " ");
	}
	//Summing of all elements 
double total = 0;
for(int i = 0; i < myList.length; i ++) {
	total += myList[i];
}
System.out.print("Total is " + total);
}
}	