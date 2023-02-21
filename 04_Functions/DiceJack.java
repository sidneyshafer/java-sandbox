import java.util.Scanner;

// CHEAT SHEET : https://www.learnthepart.com/course/2dfda34d-6bbc-4bd5-8f45-d5999de2f514/dda010f1-801c-4d39-991b-a83d4fc6dc79

public class DiceJack {
    public static void main(String[] args) {
        //Math.random() - returns a double between 0 and 0.99999999999999999
        // to return a random value between 1 and 6 : 
        // (int) (Math.random() * 6 + 1)

        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Numbers cannot be less than 1. Game over.");
            System.exit(0);
        }

        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Numbers cannot be higher than 6. Game over.");
            System.exit(0);
        }

        int sumNumbers = num1 + num2 + num3;
        int sumDiceRolls = roll1 + roll2 + roll3;

        System.out.println("Dice sum = " + sumDiceRolls + ".\nNumber sum = " + sumNumbers);

        if (checkWin(sumNumbers, sumDiceRolls)) {
            System.out.println("Congrats, you win!");
        } else {
            System.out.println("Sorry! You lose.");
        }

        scan.close();
    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
    }

    public static boolean checkWin(int sumNumbers, int sumDiceRolls) {
        int difference = sumNumbers - sumDiceRolls;
        return (sumDiceRolls < sumNumbers && difference < 3);
    }
}
