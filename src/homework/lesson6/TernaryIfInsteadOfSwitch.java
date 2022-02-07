package homework.lesson6;

public class TernaryIfInsteadOfSwitch {
    public static void main (String[] args) {
        int colorCode = 101;
        String color = null;
        color = (colorCode == 100) ?
            "Yelow" : (colorCode == 101) ? "Green" : (colorCode == 102) ? "Red" : "Invalid";
        System.out.println("Color" + " " + color);
    }
}
