package homework.lesson8;

import java.util.Arrays;

public class CopyArayElements {
    public static void main (String [] args) {
        int firstArray1 [] = {1, 2, 3, 4, 5};
        int anotherArray2 [] = new int[firstArray1.length];

        for (int i = 0; i < firstArray1.length; i++);
        anotherArray2 = firstArray1;

        System.out.println("First array is:" + " ");
        System.out.println(Arrays.toString(firstArray1));
        System.out.println("\nAnother array is:" + " ");
        System.out.println(Arrays.toString(anotherArray2));
    }
}
