import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        /* Reference Trap
         *  - setting array variables equal to each other --> DO NOT DO
         * 
         * Example:
         * int[] numbers = {1, 2, 3}
         * int[] numbers2 = numbers;
         * 
         * - both variables share the same reference to the array
         * - thus, if you change one arrau, the other will be changed as well
         * - the state of a variable should not change because you update another
         * - SOLUTION : Create a new array. Then copy everything using a loop
         * - BETTER SOLUTION : Arrays.copyOf()
         */

         String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
         //String[] staffThisYear = staffLastYear;

         //SOLUTION
         String[] staffThisYear = new String[3];
         for (int i = 0; i < staffLastYear.length; i++) {
            staffThisYear[i] = staffLastYear[i];
         }

         //BETTER SOLUTION - Arrays.copyOf()
         String[] staffNextYear = Arrays.copyOf(staffThisYear, staffThisYear.length);

         System.out.println(Arrays.toString(staffLastYear));
         System.out.println(Arrays.toString(staffThisYear));
         System.out.println(Arrays.toString(staffNextYear));

         staffThisYear[1] = "Abby";
         System.out.println(Arrays.toString(staffThisYear));
         System.out.println(Arrays.toString(staffLastYear));

    }
}
