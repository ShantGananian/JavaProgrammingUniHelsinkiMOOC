
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a year:");
        int input = scan.nextInt();
        if (input < 2015) {
            System.out.println("Ancient history!");
        } // end of if statement
    } // end of main method
} // end of class
