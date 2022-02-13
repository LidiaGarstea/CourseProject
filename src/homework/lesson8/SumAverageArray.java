package homework.lesson8;

public class SumAverageArray {
    public static void main(String[] args) {
        int oneDimensionalArray[] = {1, 2, 3, 4, 5};
        int twoDimensionalArray [] [] = {{3,4,5,8 }, {4, 6, 8, 9}};
        int arraySum1 = 0;
        int arraySum2 = 0;

        for (int i = 0; i < oneDimensionalArray.length; i++)
            arraySum1 += oneDimensionalArray[i];
        {
            System.out.println("The sum of the elements of the one dimensional array is:" + " " + arraySum1);
            System.out.println("The arithmetic mean of the one dimensional array is:" + " " + arraySum1 / oneDimensionalArray.length);

            for (int i = 0; i < twoDimensionalArray.length; i++) {
                for (int j = 0; j < twoDimensionalArray.length; j++)
                arraySum2 += twoDimensionalArray [i] [j]; }
                System.out.println("The sum of the elements of the one dimensional array is:" + " " + arraySum2);
                System.out.println("The arithmetic mean of the one dimensional array is:" + " " + arraySum2 / twoDimensionalArray.length);
        }
    }
}