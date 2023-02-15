package Day15collection;

import java.util.*;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating an ArrayList
		ArrayList<String> fruits = new ArrayList<String>();
		
		// Adding elements to ArrayList
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Berry");
		fruits.add("Apple");
		
		//Displaying ArrayList
		System.out.println(fruits); //(Mango, Berry Apple)
		//Removing Elements
		fruits.remove("Apple");
		System.out.println("After Deleting Elements: \n"+fruits); //(Mango, Berry Apple)
		

	}

}
