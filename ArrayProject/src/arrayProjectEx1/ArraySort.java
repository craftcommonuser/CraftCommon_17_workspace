package arrayProjectEx1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
	
	
	int value ; // to store user enter number of size for array
	Scanner sc = new Scanner(System.in);
	
		System.out.print(" Enter Number of array ");
		value = sc.nextInt();
		
		getIntegers(value); // call getInteger method and pass the value array size
		
		// declare and assign the use entering size of the array 
		int a[] = new int[value];
		
		// user enter the value of array
		System.out.println("Enter all the numbers:");
		for (int i = 0; i < value; i++) {
			a[i] = sc.nextInt();
		}
		
		printArray(a); // call the printing method printArray
	
		sortIntegers(a);// call the sorting method sortIntegers

	}

	//#1. get integer method for array size
	private static void getIntegers(int value) {
		// TODO Auto-generated method stub
		System.out.println("Your array size = " + value);
	}
	
	//#2. printArray method
	private static void printArray(int[] a) {
		// TODO Auto-generated method stub
		System.out.print("Your enter array value  ===>");
		System.out.print(" { ");
		for (int i = 0; i < a.length-1; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println(a[a.length-1]+ " } ");
	}
	//#3. sortInteger method
	private static void sortIntegers(int[] a) {
		
		//bubble sort 
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {   
					temp = a[i];  //if the a[i]<a[j] ==> swap 
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.print("Descending Order ===> ");
		System.out.print(" { ");
		for (int i = 0; i < a.length-1; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println(a[a.length-1] +" } ");
	}

}
