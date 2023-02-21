import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");

        System.out.print("- Username: ");
        String userInput = scan.nextLine();

        System.out.print("- Password: ");
        String psswrdInput = scan.nextLine();

        while (!psswrdInput.equals(password) || !userInput.equals(username)) {
            System.out.println("\nIncorrect, please try again!\n");

            System.out.print("- Username: ");
            userInput = scan.nextLine();

            System.out.print("- Password: ");
            psswrdInput = scan.nextLine();

        }

        System.out.println("\nSign in successful. Welcome!\n");
        
        scan.close();
        
    }
}
