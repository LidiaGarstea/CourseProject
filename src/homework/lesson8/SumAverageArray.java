package homework.lesson8;

public class SumAverageArray {
    public static void main(String[] args) {
        int oneDimensionalArray[] = {1, 2, 3, 4, 5};
        int twoDimensionalArray [] [] = {{3,4,5,8 }, {4, 6, 8, 9}};
        int arraySum1 = 0;
        int arraySum2 = 0;
        int numEven = 0;
        int numOdd = 0;

        for (int i = 0; i < oneDimensionalArray.length; i++) {
                if (i % 2 == 0) {
                    numOdd++;
            }
                else numEven++;
            arraySum1 += oneDimensionalArray[i];
        }
        {
            System.out.println("One dimensional array:");
            System.out.println("The sum of the elements is:" + " " + arraySum1);
            System.out.println("The arithmetic mean is:" + " " + arraySum1 / oneDimensionalArray.length);
            System.out.println("The number off elements evens:" + " " + numEven);
            System.out.println("The number off elements odd:" + " " + numOdd + "\n");

            for (int i = 0; i < twoDimensionalArray.length; i++) {
                int j;
                for (j = 0; j < twoDimensionalArray.length; j++)
                    if (i % 2 == 0 && j % 2 == 0) {
                        numOdd++;
                    } else numEven++;
                arraySum2 += twoDimensionalArray[i][j];
            }
            System.out.println("Two dimensional array:");
            System.out.println("The sum of the elements is:" + " " + arraySum2);
            System.out.println("The arithmetic mean is:" + " " + arraySum2 / twoDimensionalArray.length);
            System.out.println("The number off elements evens:" + " " + numEven);
            System.out.println("The number off elements odd:" + " " + numOdd);
        }
    }
}