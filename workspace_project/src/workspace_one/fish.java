
package workspace_one;

import java.util.Scanner;

public class fish {
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner A = new Scanner(System.in);
	    System.out.println("what is the fish name:" );
	      String fishName = A.next();
	      
	      System.out.println("what is the breed type:");
	      String fishBreed = A.next();
	      
	      System.out.println("what is the color of fish:");
	      String fishColor = A.next();
	      
	      System.out.println("what are the number of fish:");
	      int  fishNumber = A.nextInt();
	      
	      System.out.println("The fish name is :" + fishName);
	      System.out.println("The fish breed type is:" + fishBreed);
	      System.out.println("The fish color is :" + fishColor);
	      System.out.println("The fish number is :" + fishNumber);
	      
	      

	}
}
