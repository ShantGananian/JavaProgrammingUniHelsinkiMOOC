
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] username = {"alex", "emma"};
        String[] password = {"sunshine", "haskell"};

        System.out.println("Enter username:");
        String usrName = scanner.nextLine();

        System.out.println("Enter password:");
        String usrPassword = scanner.nextLine();

        int i = 0;
        boolean condition = false;
        while (i < username.length) {
            if (usrName.equals(username[i]) && usrPassword.equals(password[i])) {
                System.out.println("You have successfully logged in!");
                condition = true;

            }

            i++;
        }
        if (condition == false) {
            System.out.println("Incorrect username or password!");
        }

    }

}
