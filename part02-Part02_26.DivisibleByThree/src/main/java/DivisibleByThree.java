
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(3, 6);
        //divisibleByThreeInRange(2, 10);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        int number = beginning;
        for (int i = beginning; i <= end; i++) {

            if (number % 3 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }

}
