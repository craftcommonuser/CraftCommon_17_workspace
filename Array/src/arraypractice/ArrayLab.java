package arraypractice;

public class ArrayLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//An array is a collection of similar types of data.
		//Syntax 
		// declare an array
	     //  double[] data;

	       // allocate memory
	       //data = new double[10];
		// Here, the array can store 10 elements. We can also say that the size or length of the array is 10.
	
		// Using index
		
//		int [] age = {12, 4, 5, 2, 5};
//		
//		 // access each array elements
//		System.out.println("First Element: " + age[0]);
//		System.out.println("Second Element: " + age[1]);
//		System.out.println("Third Element: " + age[2]);
//		System.out.println("Fourth Element: " + age[3]);
//		System.out.println("Fifth Element: " + age[4]);

	// Looping through array elements
		
		//for loop
//		int [] age2 = {12, 4, 5};
//		
//		for(int i=0; i<age2.length; i++) {
//			System.out.println(age2[i]);
//		}
//		
		// for-each loop
		
		int[] age = {12, 4, 5};
		
		for(int a : age) {
			System.out.println(a);
			
		}
		
		//Compute Sum and Average of Array Elements
		int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		int sum = 0;
		Double average;
		
		   // access all elements using for each loop
		   // add each element in sum
		for (int number: numbers) {
			sum += number;
		}
		   average =  ((double)sum / (double)numbers.length);
			
		   
		   System.out.println("Sum = " + sum);
		   System.out.println("Average = " + average);
		}

	
}
