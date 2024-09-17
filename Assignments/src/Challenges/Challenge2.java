package Challenges;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        Arrays.sort(myIntegers);
        for (int i = myIntegers.length - 1; i >= 0; i--) {
            System.out.println(myIntegers[i]);
        }
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}