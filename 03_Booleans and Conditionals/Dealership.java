import java.util.Scanner;

//CHEAT SHEET : https://www.learnthepart.com/course/2dfda34d-6bbc-4bd5-8f45-d5999de2f514/63af31f2-d9e9-4ae2-a8b3-006e3fbb9f9b

public class Dealership {
    public static void main(String[] args) {
        
        //Setup scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java Dealership");
        System.out.println(" - Select option 'a' to buy a card");
        System.out.println(" - Select option 'b' to sell a card");

        String option = scan.nextLine();

        switch (option) {
            case "a": 
                System.out.println("What is your budget?"); 
                int budget = scan.nextInt();
                if (budget >= 10000) {

                    System.out.println("\nGreat! A Nissan Altima is available.");

                    System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
                    scan.nextLine();
                    String insurance = scan.nextLine();

                    System.out.println("\nDo you have a drivers license? Write 'yes' or 'no'");
                    String license = scan.nextLine();

                    System.out.println("\nWhat is your credit score?");
                    int creditScore = scan.nextInt();

                    if ((insurance.equals("yes")) && (license.equals("yes")) && (creditScore > 660)) {
                        System.out.println("\nSold! Pleasure doing business with you.");
                    } else {
                        System.out.println("\nWe're sorry. You are not eligible");
                    }

                } else {
                    System.out.println("\nWe do not sell cars under $10,000. Sorry!");
                }
                break;
            case "b": 
                System.out.println("\nWhat is your car valued at?"); 
                int value = scan.nextInt();
                System.out.println("\nWhat is selling price?");
                int price = scan.nextInt();

                if ((value > price) && (price < 30000)) {
                    System.out.println("\nWe will buy your car. Pleasure doing business with you!");
                } else {
                    System.out.println("\nSorry, we're not interested!");
                }
                break;
            default: System.out.println("\nInvalid option");
        }

        scan.close();
    }
}
