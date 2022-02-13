package homework.lesson8;

public class MaximAndMinimValueOfTheArray {
    public static void main (String[] args) {
        int newArray [] = {13, 27, 33, 39, 45};
        int max = 13;
        int min = 13;

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > max) {
                max = newArray[i];
            }
            else if (newArray[i] < min)  {
                min = newArray[i];
            }
        }
        System.out.println("The maxim value of the array is:" + " " + max);
        System.out.println("The minim value of the array is:" + " " + min);
        }
}

