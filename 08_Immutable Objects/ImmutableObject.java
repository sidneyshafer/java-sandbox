public class ImmutableObject {
    public static void main(String[] args) {
        /* Immutable Objects
         * - for every primitive data type, there is an immutable object type
         * include : Integer, Long, Double, Character, Boolean, String
         * 
         * 1. Immutable objects take up more size in memory
         * 2. Immutable objects can be null; primitive types cannot
         * 3. Immutable objects can call methods; primitive types cannot
         * 
         * - favor using primitive over immutable objects
         * 
         * - String is an immutable object
         */

        // primitive cannot be null; while immutable objects can be null
         int apples = 5; //4 bytes
         Integer applesWrapper = null; //16 bytes
         applesWrapper = 5;
 
         System.out.println(apples);
         System.out.println(applesWrapper);
 
         long stars = 1_000_000_000_000L; // 8 bytes
         Long starsWrapper = 1_000_000_000_000L; // 24 bytes
 
         System.out.println(stars);
         System.out.println(starsWrapper);
 
         double decimal = 1.25; // 8 bytes
         Double decimalWrapper = 1.25; // 24 bytes
 
         System.out.println(decimal);
         System.out.println(decimalWrapper);
 
         boolean bool = true; // 1 bit
         Boolean boolWrapper = true; // 16 bytes
 
         System.out.println(bool);
         System.out.println(boolWrapper);
 
         char letter = 'a'; // 2 bytes
         Character letterWrapper = 'a'; // 16 bytes
 
         System.out.println(letter);
         System.out.println(letterWrapper);
    }
}
