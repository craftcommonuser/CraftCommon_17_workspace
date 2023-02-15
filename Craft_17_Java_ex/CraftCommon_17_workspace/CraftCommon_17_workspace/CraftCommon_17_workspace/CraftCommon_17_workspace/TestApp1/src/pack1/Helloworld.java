package pack1;

import java.util.Scanner;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(" enter numbet");
			int x = sc.nextInt();

			if (x % 2 == 0) {
				System.out.println("the number is even ");
			} else {
				System.out.println(" the number is odd");
			}
		}

	}

}
