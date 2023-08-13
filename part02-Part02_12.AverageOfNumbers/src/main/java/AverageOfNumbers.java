
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count1 = 0, count2 = 0;
        double average = 0;

        while (true) {

            System.out.println("Give a number:");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            count1++;
            count2 = count2 + input;
            average = 1.0 * count2 / count1;
        }
        System.out.println("Average of the numbers: " + average);

    }
}
