package homework.lesson9;

import java.util.Scanner;

import static homework.lesson9.Character.characterA;

public class MainCharacterA {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string:");
        String string = input.nextLine();
        System.out.print("\n");
        input.close();

        char character = 'a';
        int counterCharacterA = characterA(string, character);
        System.out.println("The character" + " " + "'" + character + "'" + " " + "is displayed for" + " " + counterCharacterA + " " +"times");
    }
}
