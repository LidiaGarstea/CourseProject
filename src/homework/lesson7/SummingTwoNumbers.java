package homework.lesson7;

import java.util.Scanner;

public class SummingTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enther the first number:" + " ");
            int number1 = input.nextInt();
            System.out.println("Enter the second number" + " ");
            int number2 = input.nextInt();
            int sum = number1 + number2;
            System.out.println("Sum of number is:" + " " + sum);
            System.out.println("Your operation was successful!");
            System.out.println("You want to perform the operation again? Indroduce yes/no:" + " ");
            String stop = input.next();

            if (stop.equals("no"))
                break;
        }
        while (true); {
            System.out.println ("Your operation has ended! Thank you!");
        }
    }
}