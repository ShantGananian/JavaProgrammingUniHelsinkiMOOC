
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           int count1 = 0, count2 = 0;
         
        while (true) {

            System.out.println("Give a number:");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            count1++;
            count2 = count2 + input;
        }
        System.out.println("Number of numbers: " + count1);
     System.out.println("Sum of the numbers: " + count2);
    }

}
