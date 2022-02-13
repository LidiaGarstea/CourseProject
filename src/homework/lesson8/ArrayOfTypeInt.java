package homework.lesson8;

import homework.lesson6.SimplifySequenceByNesting;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfTypeInt {
    public static void main(String [] args) {
        int intArray;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array:" + " ");
        intArray = input.nextInt();
        int [] array = new int[intArray];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < intArray; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("Array elements:");
            System.out.print(Arrays.toString(array));
    }
}
