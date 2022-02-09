package homework.lesson7;

import java.util.Scanner;

public class ReversingANumber {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int intNumber = input.nextInt();
        while (intNumber <= 10) {
            System.out.println("The number cannot be reversed:");
            System.out.println("Introduce again:" + " ");
            intNumber = input.nextInt();
        }
        while (intNumber%10 ==0) {
            System.out.println("The number cannot be reversed:");
            System.out.println("Introduce again:" + " ");
            intNumber = input.nextInt();
        }
        System.out.println("The revers is:" + " ");
        do {
            System.out.print(intNumber % 10);
            intNumber = intNumber / 10;
        }
        while (intNumber!=0);
    }
}
