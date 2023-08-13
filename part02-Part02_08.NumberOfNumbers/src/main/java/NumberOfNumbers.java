
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            if (input != 0) {
                num++;
            }
        }
        System.out.println("Number of numbers: " + num);

    }
}
