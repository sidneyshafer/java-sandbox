public class SortingStrings {
    public static void main(String[] args) {

        /*
         * - the String class implements Comparable interface
         * - String class overrides compareTo
         * 
         * compareTo() for String returns:
         * 1. negative when the characters in the first String have a lower unicode value than the characters in the specified object (second String).
         * 2. zero if the Strings are identical.
         * 3. positive when the characters in the first String have a higher unicode value than the characters in the specified object (second String).
         */

        String john = "John";
        String amy = "Amy";
        String jane = "Jane";

        System.out.println(amy.compareTo(john)); // returns -9
        System.out.println(amy.compareTo(amy)); // returns 0
        System.out.println(john.compareTo(jane)); // returns 14
        System.out.println(jane.compareTo(john)); // returns -14
        
    }
}
