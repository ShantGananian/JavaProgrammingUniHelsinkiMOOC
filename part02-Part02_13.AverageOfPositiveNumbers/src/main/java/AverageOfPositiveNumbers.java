
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count1 = 0, count2 = 0;
        double average = 0;

        while (true) {

            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            if (input > 0) {
                count1++;
                count2 = count2 + input;
                average = 1.0 * count2 / count1;
            }

        } // end of while loop
        if (average == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }

    } // end of main method
} // end of class
