package homework.lesson6;

import java.util.Scanner;

public class SimplifySequenceByNesting {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature");

        double temperature = input.nextDouble();
        double maxTemp = 39;
        double minTemp = -12;

        if (temperature > maxTemp) {
            System.out.println("Porridge is too hot.");
        }
        else if (temperature < minTemp) {
            System.out.println("Porridge is too cool.");
        }
        else {
            System.out.println("Porridge is just right.");
        }
    }
}
