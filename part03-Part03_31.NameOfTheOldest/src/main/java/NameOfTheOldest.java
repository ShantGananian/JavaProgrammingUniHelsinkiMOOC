
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int helper = 0;
        String helperName = "";
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            String[] inputArray = input.split(",");

            if (Integer.valueOf(inputArray[1]) > helper) {
                helper = Integer.valueOf(inputArray[1]);
                helperName = inputArray[0];
            }

        }
        System.out.println("Name of the oldest: " + helperName);

    }
}
