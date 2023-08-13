
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int inputTo = scanner.nextInt();
        System.out.println("Where from?");
        int inputFrom = scanner.nextInt();
        for (int i = inputFrom; i <= inputTo; i++) {
            System.out.println(i);
        }
    }
}
