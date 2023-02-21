import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* Higher Order Functions
         * Consumer: receives a parameter and produces a side-effect.
         *  - example: x -> {code}
         * Predicate: receives one parameter and produces a boolean.
         *  - example: x -> {return boolean}
         * Function: receives one parameter and returns any value.
         *  - example: x -> {return value}
         * BiConsumer: receives two parameters and produces a side-effect.
         *  - example: (x,y) -> {code}
         * Comparator: receives two parameters and returns an integer.
         *  - example: (x,y) -> {return int}
         * BinaryOperator: receives two parameters and returns a value of the same type.
         *  - example: (x,y) -> {return value}
         */

        /* The Process:
         * 1. Higher order functions need to know your intent.
         * 2. You can express your intent in the form of a Lambda Expression.
         */

        List<String> facts = Arrays.asList(
            "Marie Curie was the first woman to win a Nobel Prize.",
            "She received the Nobel Prize in Physics in 1903, and the Nobel Prize in Chemistry in 1911.",
            "Curie was a pioneer in the field of radioactivity, and her work led to the development of X-ray technology.",
            "She was the first woman to become a professor at the Sorbonne, and the first woman to be entombed on her own merits in the Panthéon.",
            "Curie died at the age of 66 from complications related to her prolonged exposure to radiation.",
            "She is remembered as one of the most influential scientists in history.",
            "Her legacy lives on through the Marie Curie Cancer Care charity, which provides care and support to people with terminal illnesses.",
            "Curie's contributions to science and medicine have been recognized and celebrated worldwide."
        );


        //foreach() is a higher order function that relies on a Consumer
        facts.forEach(fact -> {
            System.out.println("\n" + fact);
        });

        //can also be written in one line:
        //facts.forEach(fact -> System.out.println("\n" + fact));
        
    }
}