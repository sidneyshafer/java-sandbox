public class LogicalOperators {
    
    public static void main(String[] args) {
        //Logical Operators
        /*
         * let you compare many things at once
         * the most common are : OR and AND
         */
        /* OR Operator
         * - returns true if either comparison is true
         * - the OR Operator : ||
         * - you can combine multipl comparisons
         * example : (comparison1 || comparison2)
         */

         int chemGrade = 74;
         int englishGrade = 65;
         String language = "Java";

         if (chemGrade > 75 || englishGrade > 75 || language.equals("Java")) {
            System.out.println("Congrats! You got the scholorship.");
         } else {
            System.out.println("We're, sorry, you did not get the scholorship.");
         }

         /* AND Operator
          *  - returns true if every comparison is true
          *  - the AND Operator : &&
          */

          int credits = 56;
          double GPA = 1.4;

          if (credits >= 40 && GPA >= 2.0) {
            System.out.println("You earned your diploma!");
          } else {
            System.out.println("Sorry, you did not earn your diploma.");
          }
    }
}
