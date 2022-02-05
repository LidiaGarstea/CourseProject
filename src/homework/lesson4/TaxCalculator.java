package homework.lesson4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main (String[] args) {
        Scanner time = new Scanner(System.in);
        System.out.println("Enter the minutes: ");
        long minutes = time.nextLong();

        double days = minutes/24/60;
        double years = minutes/365/24/60;

        System.out.println("Days " + days);
        System.out.println("Years " + years);
        }
    }
