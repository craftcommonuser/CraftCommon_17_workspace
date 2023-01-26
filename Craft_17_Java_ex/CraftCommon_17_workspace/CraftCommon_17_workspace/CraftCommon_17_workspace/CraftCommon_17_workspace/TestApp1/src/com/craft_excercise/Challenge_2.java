package com.craft_excercise;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge_2 {

	public static void main(String[] args) {
		int value, descSort;
	     
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Number to be sorted ");
       value = sc.nextInt();
        int a[] = new int[value];
        System.out.println("Enter all the numbers:");
        for (int i = 0; i < value; i++) 
        {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < value; i++) 
        {
            for (int j = i + 1; j < value; j++) 
            {
                if (a[i] < a[j]) 
                {
                     descSort = a[i];
                    a[i] = a[j];
                    a[j] = descSort;
                }
            }
        }
        System.out.print("Descending Order:");
        for (int i = 0; i < value - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[value - 1]); {
    
}}}
