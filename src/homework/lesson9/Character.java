package homework.lesson9;

public class Character {
    public static int characterA (String string, char character) {
       int counterCharacterA = 0;
       for (int i = 0; i < string.length(); i++) {
           if (string.charAt(i) == character) {
               counterCharacterA++;
           }
       }
       return counterCharacterA;
    }
}
