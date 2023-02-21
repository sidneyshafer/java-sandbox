import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        
        //What is a delimiter?
        /*
         * - white space that separates input data
         * ex: if you where to enter three numbers in row seperated by a space like this : 20 30 40 
         * --- you would have to use three scan.nextInt methods to pick them up
         */
        //Methods delimited by white space
        /*
         * scan.nextInt()
         * scan.nextLong()
         * scan.nextDouble()
         * scan.next() -- Strings
         * -- NOT THIS : scan.nextline() <-- reads the entire line, including white space, as one big string value
         */

        //scan.nextline() trap
        /* happens when scan.nextline is ahead of :
         * scan.nextInt(), scan.nextLong(), scan.nextDouble(), or scan.next()
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = scan.nextInt();

        scan.nextLine(); //must out another "throwaway" next line before actual next line
        System.out.println("Please write a sentence");
        String sentence = scan.nextLine();

        scan.close();

        System.out.println("\tNumber: " + num);
        System.out.println("\tSentence: " + sentence);

        /* 
        System.out.println("Enter two integers (on the same line)");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("Enter two VERY BIG integers (on the same line)");
        long bigNum1 = scan.nextLong();
        long bigNum2 = scan.nextLong();

        System.out.println("Enter two decimals (on the same line)");
        double decimal1 = scan.nextDouble();
        double decimal2 = scan.nextDouble();

        System.out.println("Enter two text values (on the same line)");
        String text1 = scan.next();
        String text2 = scan.next();

        scan.close();

        System.out.println("\tIntegers : " + num1 + " " + num2);
        System.out.println("\tBig Integers : " + bigNum1 + " " + bigNum2);
        System.out.println("\tDecimals : " + decimal1 + " " + decimal2);
        System.out.println("\tText : " + text1 + " " + text2);
    */
    }
}
