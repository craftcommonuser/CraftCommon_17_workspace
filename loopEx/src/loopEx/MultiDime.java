package loopEx;

import java.util.Scanner;

public class MultiDime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        System.out.print(a[value - 1]);
//		double[][] mark = {{84,56,86,66,96,78,96,78,88,65},
//				{84,56,86,66,96,78,96,78,88,65},
//				{84,56,86,66,96,78,96,78,88,65},
//				{84,56,86,66,96,78,96,78,88,65},
//				{84,56,86,66,96,78,96,78,88,65}};
//	
//				for(int i =0; i<mark.length; i++) {
//					
//					
//					for(int j=0; j<mark[i].length; j++) {
//		
//						System.out.print(mark[i][j] + " ");
//						
//					}
//					System.out.println();
				//}
	}

}
