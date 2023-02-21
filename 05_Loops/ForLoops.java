public class ForLoops {
    public static void main(String[] args) {
        /* Use a for loop :
         *  - when you know how many times a code needs to run
         */
        /* Use a while loop :
         *  - when it's not clear how many times a code needs to run
         */

         /* For loop has 3 parts :
          *  1. Start: loop starts running at 'i = 1;'
          *  2. Stop: runs as long as 'i <= 3;'
          *  3. Step (or increment): 'i++' increases by 1 after each run
          */
        
          for (int i = 1; i <= 3; i++) {
            System.out.println(i);
          }

          /* print VS println
           * - println() prints text and moves to a new line.
           * - print prints text but it does not move to a new line. So, ensuing print calls print on the same line.
           */
    }
}