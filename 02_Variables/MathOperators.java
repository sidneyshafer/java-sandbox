public class MathOperators {
    
    public static void main(String[] args) {
        /* OPERATORS
          + (plus)
          - (minus)
          * (multiplication)
          / (division)
          % (modulus) - returns the remainder of a division
          ++ (add 1) - increases the value by 1
          -- (subtract 1) - decreases the value by 1
          += (add by) - increases the value by numver on the right
          -= (subtract by) - decreases the value by number on the right
         */

        int bagOfSweets1 = 5;
        int bagOfSweets2 = 10;

        long starsInMilkyWay = 250_000_000_000L; //250 billion
        long starsInAndromeda = 1_000_000_000_000L; // 1 trillion

        double testScore = 6.7;

        System.out.println("Fred and George collected " + (bagOfSweets1 + bagOfSweets2) + " sweets");
        System.out.println("There are " + (starsInMilkyWay + starsInAndromeda) + " stars in the Milky Way and Andromeda galaxies.");

        System.out.println("Fred has " + (bagOfSweets2 - bagOfSweets1) + " more sweets than George");
        System.out.println("The Andromeda Galaxy has " + (starsInAndromeda - starsInMilkyWay) +" more stars than the Milky Way");

        System.out.println("Snape made an error on his excel, accidentally multiplying Ron's score to: " + (testScore * 1.25) + "/10");
        System.out.println("Snape caught the error. Furious, he divided Ron's score to: " + (testScore / 2.0));
        
        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of: " + (10 % 2));
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of: " + (5 % 2));

        int counter = 0;
        counter++;
        counter++;
        counter++;
        System.out.println(counter);
        counter--;
        counter--;
        counter--;
        System.out.println(counter);
        counter += 5;
        counter += 1;
        System.out.println(counter);
        counter -= 2;
        System.out.println(counter);

    }
}
