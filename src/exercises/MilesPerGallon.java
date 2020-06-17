package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your miles driven:");
        double miles = input.nextDouble();
        System.out.println("Enter your gallons of gas consumed:");
        double gallons = input.nextDouble();
        double milesPerGallon = miles/gallons;
        System.out.println("That's "+ milesPerGallon + " miles per gallon.");

    }
}
