package homework.lesson8;

public class SpecificValueOfArray {
    public static void main (String [] args) {
        int newArray [] = {13, 18, 27, 39, 55};
        int specificValue = 39;
        boolean valueFond = false;

        for (int i = 0; i < newArray.length; i++) {
        if (i == specificValue) {
            valueFond = true;
            break;
            }
        }
        if (valueFond) {
            System.out.println("The array contains the value:" + specificValue);
        }
        else {
            System.out.println("The array does not contain the value:" + specificValue);
        }
    }
}
