package arrayProjectEx1;

import java.util.Arrays;

public class SimpleArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simpleSort();
	}
	// this is sample of sorrting array by Array. sort method
	
	private static void simpleSort() {
		// I use the Array.sort method to sort easily 
		int xyz;
		int[] arrContener = { 50, 66, 3, 74, 12, 45, 6 }; // sample array

		Arrays.sort(arrContener); // sort by ascending
		for (int i = 0; i <arrContener.length; i++) {

		System.out.print(arrContener[i] + " ");
		}
		System.out.println();
		
		
		// print array value by descending
		for (int i = arrContener.length - 1; i >= 0; i--) {

			System.out.print(arrContener[i] + " ");

		}

		System.out.println();
		System.out.println("--------------------------------------");

}
}