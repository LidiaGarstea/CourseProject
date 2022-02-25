package homework.lesson12;

public class HomeworkExecution {
    public static void main (String [] args) {
        ValidationInput validationInput = new ValidationInput();

        while (true) {
            int k;
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("This is the MAIN menu of Lesson 12 homework. " +
                    "\n Please enter the corresponding number of the problem you want to run!");
            System.out.println("1. Run the program that display the charge for the current customer and that calculate " +
                    "and display the running total of yesterday's receipts.");
            System.out.println("2. Run the program that determines the number of all prime numbers less than 10,000 and" +
                            "displays them");
            System.out.println("0. Exit the MAIN menu!");
            System.out.println("-------------------------------------------------------------------------------------------");
            k = validationInput.intInput();

            switch (k) {
                case 1: VoidParkingCharges.Parking();
                    break;
                case 2: VoidPrimeNumber.Number();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("You have entered a non valid option");
            }
        }
    }
}