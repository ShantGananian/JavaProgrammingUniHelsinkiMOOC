
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int helper = 0;
        String helperName = "";
        int sum = 0;
        int counter = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }
            String[] inputArray = input.split(",");
            sum += Integer.valueOf(inputArray[1]);
            counter++;
            String word = inputArray[0];
            int length = word.length();
            if (length > helper) {
                helper = length;
                helperName = inputArray[0];
            }

        }
        System.out.println("Longest name: " + helperName);
        System.out.println("Average of the birth years: " + (1.0 * sum / counter));

    }
}
