package homework.lesson12;

public class ParkingCharges {
    private final double costMin = 2.0;
    private final double costAdditional = 0.5;
    private final double costMax = 10.0;
    private double parkedHours;
    private double clientCharge;
    private double parkedHourse;

    public void setParkedHours(int parkedHourse) {
        this.parkedHours = parkedHourse;
    }

    public double getClientCharge () {
        return clientCharge;
    }
    public void calculateCharges () {
        if (parkedHours == 24) {
            clientCharge = costMax;
        }
        else if (parkedHours >= 1 && parkedHours <= 3) {
            clientCharge = costMin;
        }
        else if (parkedHours > 3 && parkedHours < 24) {
            double hoursAdditional = parkedHours - 3;

            clientCharge = hoursAdditional * costAdditional + costMin;
        }
    }
    public static double calculateTotalProfit (ParkingCharges [] clients) {
        double sum = 0;
        for (ParkingCharges client : clients) {
            sum += client.clientCharge;
        }
        return sum;
    }
}