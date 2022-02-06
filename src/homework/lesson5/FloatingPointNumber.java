package homework.lesson5;

import java.util.Scanner;

public class FloatingPointNumber {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input the value");
        Double value = input.nextDouble();

        if (value == 0) {
            System.out.println("The value is zero");
        }

        else if (Math.abs(value) < 1) {
            if (value < 1)
                if (value > 0)
                System.out.println("The value is positive and small number");
            else
                System.out.println("The value is negative and small number");
        }

        else if (Math.abs(value) > 1_000_000) {
            if (value > 1_000_000)
                    System.out.println("The value is positive and large number");
            else
                System.out.println("The value is negative and large number");
        }

        else if (value > 1) {
            if (value < 1_000_000)
                System.out.println("The value is positive");
        }

        else if (value < -1) {
            if (value > -1_000_000)
                System.out.println("The value is negative");
          }

        input.close();
    }
}
