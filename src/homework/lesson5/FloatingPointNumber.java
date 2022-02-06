package homework.lesson5;

import java.util.Scanner;

public class FloatingPointNumber {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input the value");
        Double value = input.nextDouble();

        if (value == 0) {
            if (Math.abs(value) < 1)
            System.out.println("The value is zero and small number");
            else
                System.out.println("The value is zero and large number");
        }
        else if (value > 0) {
            if (Math.abs(value) > 1_000_000)
            System.out.println("The value is positive and large number");
            else
                System.out.println("The value is positive and small number");
       }
        else {
            System.out.println("The value is negative and small number");
        }
        input.close();
    }
}
