package homework.lesson12;

import java.util.Scanner;

public class VoidParkingCharges {

    public static void Parking() {
        ParkingCharges customer1 = new ParkingCharges();
        ParkingCharges customer2 = new ParkingCharges();
        ParkingCharges customer3 = new ParkingCharges();
        getAction(customer1);
        getAction(customer2);
        getAction(customer3);
        ParkingCharges [] clients = {customer1, customer2, customer3};
        System.out.println("Total of yesterday's receipts: " + ParkingCharges.calculateTotalProfit(clients) + " " + "$");
    }

    private static void getAction(ParkingCharges client) {
        System.out.println("Welcome to garage park!");
        System.out.print("How many hours do you want to park: ");
        int hours = ValidationInput.intInput();
        client.setParkedHours(hours);
        client.calculateCharges();
        System.out.println("Customer fee: " + client.getClientCharge() + " " + "$" + "\n");
    }
}