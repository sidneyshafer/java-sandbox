import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
       int secret = 3;
    
       Scanner scan = new Scanner(System.in);
       int guess = scan.nextInt();

       while (guess != secret) {
        System.out.print("Guess again: ");
        guess = scan.nextInt();
       }
       System.out.println("You got it!");
        
        scan.close();
    }

}
