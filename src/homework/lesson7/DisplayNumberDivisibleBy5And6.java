package homework.lesson7;

import java.util.Scanner;

public class DisplayNumberDivisibleBy5And6 {
    public static void main(String[] args) {
        System.out.println("All numbers from 100 to 1000, which are divisible by 5 and 6:");
        for (int i = 100, k = 1; i <= 1000; i++) {
            if (i % 30 == 0) {
                if (k % 10 != 0) {
                    System.out.print (i + " ");
                }
                else {
                    System.out.println (i + " "); }
                k ++;
            }
        }
    }
}

