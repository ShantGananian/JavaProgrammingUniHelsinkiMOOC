
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write numbers:");
        int sum = 0, count = 0, evenNumber = 0, oddNumber = 0;
        double avg = 0;

        while (true) {
            int numbers = Integer.valueOf(scanner.nextLine());

            if (numbers == -1) {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                System.out.println("Average: " + avg);
                System.out.println("Even: " + evenNumber);
                System.out.println("Odd: " + oddNumber);

                break;
            }
            if (numbers % 2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
            sum += numbers;
            count++;
            avg = (sum * 1.0) / count;
        }
    }
}
