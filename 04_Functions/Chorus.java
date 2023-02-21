public class Chorus {
    public static void main(String[] args) {
        
        //Functions
        /*
         * - a grouping of code that performs a task
         * - write functions using lowerCamelCase (e.i. singChorus, playGame)
         * - function and method mean the same thing
         */
        //Parts of a Function
        /*
         * 1. Level of access - public, private
         * 2. Return value - void, or data type
         * 2.1 - static keyword
         * 3. Function name
         * 4. Parameters
         * 4. The code that performs the task
         */

         //Call function
         singChorus();
         singChorus();
         singChorus();
         singChorus();

    }

    public static void singChorus() {

        System.out.println("Don't blame it on the sunshine");
        System.out.println("Don't blame it on the moonlight");
        System.out.println("Don't blame it on good times");
        System.out.println("Blame it on the boogie\n");
    }
}