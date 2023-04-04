// validate user based on username and password
// input username and password until username=="anis" and password=="123456"
// if username and password does not match print "username/password is incorrect. Please try again"
// if username and password does not match print "welcome to the system"
import java.util.Scanner;
public class AssignmentSixteen {

    public static void main(String[] args) {

        String correctUsername = "anis";
        String correctPassword = "123456";

        Scanner input = new Scanner(System.in);

        String username, password;

        do {
            System.out.print("Enter your username: ");
            username = input.next();

            System.out.print("Enter your password: ");
            password = input.next();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Welcome to the system!");
                break;
            } else {
                System.out.println("Username/password is incorrect. Please try again.");
            }
        } while (true);

        input.close();
    }
}
