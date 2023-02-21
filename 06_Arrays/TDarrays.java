import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        /* 2D Arrays
         * - an array that contains arrays
         * - perfect for data in the form of a table
         * 
         * How to Create :
         *  1. the type with two brackets
         *  2. Number of rows
         *  3. Number of elements per row
         * 
         * example: int[][] integers = new int[3][4]
         *  - this array has 3 rows and 4 columns
         */

        /* 
        int[][] grades = new int[3][4];

        grades[0][0] = 78;
        grades[0][1] = 74;
        grades[0][2] = 72;
        grades[0][3] = 85;

        grades[1][0] = 63;
        grades[1][1] = 70;
        grades[1][2] = 50;
        grades[1][3] = 65;

        grades[2][0] = 100;
        grades[2][1] = 99;
        grades[2][2] = 98;
        grades[2][3] = 99;
        */

        int[][] grades = {
            {78, 74, 72, 85},
            {63, 70, 50, 65},
            {100, 99, 98, 99}
        };

        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));

        System.out.println("\n");

        System.out.println("\tHarry: " + grades[0][0] + " " + grades[0][1] + " " + grades[0][2] + " " + grades[0][3]);
        System.out.println("\tRon: " + grades[1][0] + " " + grades[1][1] + " " + grades[1][2] + " " + grades[1][3]);
        System.out.println("\tHermione: " + grades[2][0] + " " + grades[2][1] + " " + grades[2][2] + " " + grades[2][3]);
    }
}
