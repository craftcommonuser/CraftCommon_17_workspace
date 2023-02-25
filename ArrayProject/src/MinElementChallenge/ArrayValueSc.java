package MinElementChallenge;

import java.util.Scanner;
//Exception handler class
class MyException extends Exception {
	public MyException() {
		System.out.println("Enter only number value");

	}
}

public class ArrayValueSc {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub

		readIntegers();

	}

	private static void findMin(int a[]) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("The min value of you enter array is:" + a[a.length - 1]);

	}

	public static void readIntegers() throws MyException {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count, min;

		System.out.println("Please enter how many the array value you want");
		// to control the use if enter not number value
		if (!(sc.hasNextInt())) {
			throw new MyException();

		}
		count = sc.nextInt();

		int myArray[] = new int[count];

		// enter all array value
		System.out.println("Please enter all numeber for the array value");

		for (int i = 0; i < count; i++) {
			// to control the use if enter not number value
			if (!(sc.hasNextInt())) {
				throw new MyException();

			}
			myArray[i] = sc.nextInt();
		}

		// sort the array by blubble sort method
		for (int i = 0; i < count; i++) {

			for (int j = i + 1; j < count; j++) {

				if (myArray[i] < myArray[j]) {
					min = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = min;
				}

			}

		}

		// to display all the array value
		System.out.print("Decending order of your array value is :");
		System.out.print("{");
		for (int i = 0; i < count; i++) {
			System.out.print(myArray[i] + " ");

		}
		System.out.print("}");
		// calling findMind Method to display the min
		findMin(myArray);

	}

}
