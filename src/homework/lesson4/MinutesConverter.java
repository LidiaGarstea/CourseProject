package homework.lesson4;

public class MinutesConverter {
    public static void main (String[] args) {
        double price, tax, quantity, total;

        price = 1000.5;
        tax = price * 0.12;
        quantity = 20.0;
        total = price * tax * quantity;

        System.out.println("Total cost with taxis: " + total);
    }
}
