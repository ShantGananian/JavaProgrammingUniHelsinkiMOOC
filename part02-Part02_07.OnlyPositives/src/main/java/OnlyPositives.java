
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();
            if (input < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            if (input == 0) {
                break;
            }
            System.out.println(input * input);

        } // end of while loop

    } // end of main method
}
