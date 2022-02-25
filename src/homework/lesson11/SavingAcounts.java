package homework.lesson11;

public class SavingAcounts {
    public static double annualInterestRate;

    private double savingBalance;

    public void setSavingBalance (double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public double getSavingBalance () {
        return savingBalance;
    }

    public double calculateInterestRate () {
        return savingBalance + savingBalance * annualInterestRate/12;
    }

    public static void modifyInterestRate (double modifyInterest) {
        annualInterestRate = modifyInterest/100;
    }

}
