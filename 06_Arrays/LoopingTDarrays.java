public class LoopingTDarrays {
    public static void main(String[] args) {
        //need a nested for loop to run through a 2D array

        int[][] grades = {
            {78, 74, 72, 85},
            {63, 70, 50, 65},
            {100, 99, 98, 99}
        };

        /*
        for (int j = 0; j < grades[0].length; j++) {
            System.out.print(grades[0][j] + " "); //[0][0] [0][1] [0][2] [0][3]
        }
        System.out.println("\n");

        for (int j = 0; j < grades[1].length; j++) {
            System.out.print(grades[1][j] + " "); //[1][0] [1][1] [1][2] [1][3]
        }
        System.out.println("\n");

        for (int j = 0; j < grades[2].length; j++) {
            System.out.print(grades[2][j] + " "); //[2][0] [2][1] [2][2] [2][3]
        }
        System.out.println("\n");
        */

        for (int i = 0; i < grades.length; i++) {

            switch (i) {
                case 0: System.out.print("\tHarry: "); break;
                case 1: System.out.print("\tRon: "); break;
                case 2: System.out.print("\tHermione: "); break;
            }

            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
