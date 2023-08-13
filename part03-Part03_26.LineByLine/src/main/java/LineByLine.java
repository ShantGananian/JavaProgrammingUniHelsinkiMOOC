
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            if (input.equals("")) {

                break;
            }

            int i = 0;

            while (i < inputArray.length) {
                System.out.println(inputArray[i]);
                i++;
            }

        }
    }
}
