
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        while (true) {
            int listItem = scanner.nextInt();

            if (listItem == -1) {
                break;
            }
            list.add(listItem);
        } // end of while loop

        int sum = 0;
        int counter = 0;
        for (int item : list) {
            sum += item;
            counter++;
        }
        double avg = sum * 1.0 / counter;

        System.out.println("Average: " + avg);

        
    }
}
