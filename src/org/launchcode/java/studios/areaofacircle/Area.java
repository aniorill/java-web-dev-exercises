package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
      //A = pi * r * r
      //pi = 3.14
      //r = radius
        double pi = 3.14;
        double radius;
        double A;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        radius = input.nextInt();
        input.close();
        A = Circle.getArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is equal to " + String.format("%.2f",A) + ".");

    }

}
