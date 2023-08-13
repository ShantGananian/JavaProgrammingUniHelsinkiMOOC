
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String firstInput = scanner.nextLine();
        System.out.println("What is their job?");
        String secondInput = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Once upon a time there was "+firstInput+", who was "+secondInput+".");
        System.out.println("On the way to work, "+firstInput+" reflected on life.");
        System.out.println("Perhaps "+firstInput+" will not be "+secondInput+" forever.");
    }
}
