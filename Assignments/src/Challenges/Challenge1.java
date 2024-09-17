package Challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Challenge1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        sortIntegers(myIntegers);
        printArray(myIntegers);
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static void sortIntegers(int[] array) {
        Arrays.sort(array);
    }
}