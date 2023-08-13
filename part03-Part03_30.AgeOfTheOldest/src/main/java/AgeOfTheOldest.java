
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int helper = 0;
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            String[] inputArray = input.split(",");

            if (Integer.valueOf(inputArray[1]) > helper) {
                helper = Integer.valueOf(inputArray[1]);
            }

        }
        System.out.println("Age of the oldest: " + helper);
    }
}
