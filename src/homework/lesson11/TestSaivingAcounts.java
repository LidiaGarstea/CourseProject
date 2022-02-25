package homework.lesson11;

import static homework.lesson11.SavingAcounts.annualInterestRate;

public class TestSaivingAcounts {
    public static void main (String[] args) {
        SavingAcounts.modifyInterestRate(4);

        SavingAcounts saver1 = new SavingAcounts();
        saver1.setSavingBalance(2000.00d);
        System.out.printf("Balance for the current month at the annual rate of 4 percent:" + "\n" +
                        "saver1 - %.2f $\n",
                saver1.calculateInterestRate());

        SavingAcounts saver2 = new SavingAcounts();
        saver2.setSavingBalance(3000.00d);
        System.out.printf("saver2 - %.2f $\n", saver2.calculateInterestRate());

        SavingAcounts.modifyInterestRate(5);
        System.out.printf("\nBalance for the following month at the annual rate of 5 percent:" + "\n" +
               "saver 1 - %.2f $\n", saver1.calculateInterestRate()+annualInterestRate);
        System.out.printf("saver2 - %.2f $\n", saver2.calculateInterestRate()+annualInterestRate);
    }
}
