package homework.lesson9;

import java.util.Scanner;

public class MainArea {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the width of rectangle:" + " ");
        double whidth = input.nextDouble();
        while (whidth <= 0) {
            System.out.println("The value is invalid:");
            System.out.print("Introduce again:" + " ");
            whidth = input.nextDouble();
        }

        System.out.println("Input the heidth of rectangle:" + " ");
        double heigth = input.nextDouble();
        while (heigth <= 0) {
            System.out.println("The value is invalid:");
            System.out.print("Introduce again:" + " ");
            heigth = input.nextDouble();
        }

        AreaRectangle rectangle = new AreaRectangle();
        rectangle.setDim(whidth, heigth);
        rectangle.getArea();
        System.out.println("Area:" + " " + rectangle.getArea());
    }
}
