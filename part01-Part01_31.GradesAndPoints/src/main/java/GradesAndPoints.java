
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int input = scan.nextInt();
        if (input < 0) {
            System.out.println("Grade: impossible!");
        } else if (input <= 49) {
            System.out.println("Grade: failed");
        } else if (input <= 59) {
            System.out.println("Grade: 1");
        } else if (input <= 69) {
            System.out.println("Grade: 2");
        } else if (input <= 79) {
            System.out.println("Grade: 3");
        } else if (input <= 89) {
            System.out.println("Grade: 4");
        } else if (input <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }

    }
}
