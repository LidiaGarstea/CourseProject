package homework.lesson5;

import com.sun.deploy.security.SelectableSecurityManager;

import java.io.PrintStream;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the length of rectangle 1:" + " ");
        double lengtTheRectangle1 = input.nextDouble();
        while (lengtTheRectangle1 <= 0) {
            System.out.println("The value is invalid:" + " " + lengtTheRectangle1);
            System.out.print("Introduce again:" + " ");
            lengtTheRectangle1 = input.nextDouble();
        }

        System.out.println("Input the width of rectangle 1:" + " ");
        double widthTheRectangle1 = input.nextDouble();
        while (widthTheRectangle1 <= 0) {
            System.out.println("The value is invalid:" + " " + widthTheRectangle1);
            System.out.print("Introduce again:" + " ");
            widthTheRectangle1 = input.nextDouble();
        }

        double areaTheRectangle1 = lengtTheRectangle1 * widthTheRectangle1;
        System.out.println("Area of rectangle 1 is:" + " " + areaTheRectangle1);

        System.out.println("Input the length of rectangle 2:" + " ");
        double lengtTheRectangle2 = input.nextDouble();
        while (lengtTheRectangle2 <= 0) {
            System.out.println("The value is invalid:" + " " + lengtTheRectangle2);
            System.out.print("Introduce again:" + " ");
            lengtTheRectangle2 = input.nextDouble();
        }

        System.out.println("Input the width of rectangle 2:" + " ");
        double widthTheRectangle2 = input.nextDouble();
        while (widthTheRectangle2 <= 0) {
            System.out.println("The value is invalid:" + " " + widthTheRectangle2);
            System.out.print("Introduce again:" + " ");
            widthTheRectangle2 = input.nextDouble();
        }

        double areaTheRectangle2 = lengtTheRectangle2 * widthTheRectangle2;
        System.out.println("Area of rectangle 2 is:" + " " + areaTheRectangle2);

        if (areaTheRectangle1 > areaTheRectangle2) {
            System.out.println("Area of rectangle 1 is has greater area of rectangle 2");
        } else if (areaTheRectangle2 > areaTheRectangle1) {
            System.out.println("Area of rectangle 2 is has greater area of rectangle 1");
        } else {
            System.out.println("Area of rectangle 1 = area of rectangle 2");
        }

    }
}
