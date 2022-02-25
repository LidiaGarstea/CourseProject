package homework.lesson12;

import java.util.Scanner;

public class ValidationInput {
    static Scanner scanner;

    public ValidationInput () {
        scanner = new Scanner(System.in);
    }

    public static int intInput() {
        int intInput = scanner.nextInt();
        while (intInput < 0) {
            System.out.println("The input should not be <0");
            intInput = scanner.nextInt();
        }
        scanner.nextLine();
        return intInput;
    }
}