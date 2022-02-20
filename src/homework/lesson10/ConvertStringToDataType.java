package homework.lesson10;

public class ConvertStringToDataType {
    public static void main (String [] args) {
        System.out.println("Convert String values to appropriate primitive date types:");
        boolean b = new Boolean("True");
        boolean b1 = b;
        System.out.println("Value of b: " + b + "\n" + "Value of b1: " + b1);

        Byte bt = new Byte("120");
        Byte bt1 = bt;
        System.out.println("Value of bt: " + bt + "\n" + "Value of bt1: " + bt1);

        short sh = new Short("3200");
        short sh1 = sh;
        System.out.println("Value of bt: " + sh + "\n" + "Value of bt1: " + sh1);

        int i = new Integer("147895632");
        int i1 = i;
        System.out.println("Value of bt: " + i + "\n" + "Value of bt1: " + i1);

        long l = new Long("987654321987654321");
        long l1 = l;
        System.out.println("Value of bt: " + l + "\n" + "Value of bt1: " + l1);

        double d = new Double("4444.5d");
        double d1 = d;
        System.out.println("Value of bt: " + d + "\n" + "Value of bt1: " + d1);

        float f = new Float("2354,56f");
        float f1 = f;
        System.out.println("Value of bt: " + f + "\n" + "Value of bt1: " + f1);
    }
}
