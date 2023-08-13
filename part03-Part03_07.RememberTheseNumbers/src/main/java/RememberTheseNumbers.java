
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            } // end of if statement

            numbers.add(luku);
        } //end of while loop
        for (int i : numbers) {
            System.out.println(i);
        }

    } //end of main method
}
