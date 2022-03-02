package homework.lesson12;

public class PrimeNumbers {
    public static boolean isPrime(int number) {
        boolean num = number >= 2;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                num = false;
                break;
            }
        }
        return num;
    }
    public static int getCountPrimeNumbers(int start, int end) {
        int counting = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                counting++;
            }
        }
        return counting;
    }

}
