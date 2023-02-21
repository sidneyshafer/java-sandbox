public class Comparisons {
    public static void main(String[] args) {
        //Comparisons
        /*
         > - greater than
         < - less than
         >= - greater than or equal to
         <= - less than or equal to
         == - equal to
         equals - equal to (for String)
         !equals - not equal to (for String)
         */

         int chemGrade = 95;
         int bioGrade = 75;
         int englishGrade = 75;

         // greater than
         boolean grade1 = bioGrade > chemGrade; // false

         // less than
         boolean grade2 = bioGrade < chemGrade; // true

         // greater than or equal to
        boolean grade3 = chemGrade >= englishGrade; // true

        // less than or equal to
        boolean grade4 = bioGrade <= englishGrade; // true

        //equal to
        boolean grade5 = bioGrade == chemGrade; // false

        //not equal to
        boolean grade6 = englishGrade != bioGrade; // false

         System.out.println(grade1);
         System.out.println(grade2);
         System.out.println(grade3);
         System.out.println(grade4);
         System.out.println(grade5);
         System.out.println(grade6);

         double sales = 37.55;
         double costs = 5.55;
        
         boolean profit = sales > costs;
         System.out.println(profit);

        //equals for String values
        String sentence1 = "I love this course!";
        String sentence2 = "I love this course!";

        boolean isEqual = sentence1.equals(sentence2); // true

        System.out.println(isEqual);

        //not equals method for String values
        boolean isNotEqual = !sentence1.equals(sentence2); // false
        System.out.println(isNotEqual);
    }
}
