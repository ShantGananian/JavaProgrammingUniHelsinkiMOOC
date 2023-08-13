
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        double input = scan.nextDouble();

        if (input < 5000) {
            System.out.println("No tax!");
        } else if (input < 25000) {
            double tax = (100 + (input - 5000) * 0.08);
            System.out.println("Tax: " + tax);
        } else if (input < 55000) {
            double tax = (1700 + (input - 25000) * 0.1);
            System.out.println("Tax: " + tax);
        } else if (input < 200000) {
            double tax = (4700 + (input - 55000) * 0.12);
            System.out.println("Tax: " + tax);
        } else if (input < 1000000) {
            double tax = (22100 + (input - 200000) * 0.15);
            System.out.println("Tax: " + tax);
        } else {
            double tax = (142100 + (input - 1000000) * 0.17);
            System.out.println("Tax: " + tax);

        } // end of if statement
    } // end of main method
} // end of class
