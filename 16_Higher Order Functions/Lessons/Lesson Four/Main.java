import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* Stream Operations
         * 1. Convert your data source into a stream of elements (i.e. prices.stream())
         * 
         * 2. Add a filter operation to the pipeline
         *      filter : recieves a stream of elements and returns a filtered stream
         *          - relies on your intent in the form of a Predicate 
         *              -> Predicate : recieves one parameter and produces a boolean
         * 
         * 3. Add a map operation to the pipeline
         *    - map operation transforms every element in the stream
         *      -> relies on your intent in the form of a Function
         * 
         * 4. Add a sorted operation to the pipeline
         *    - sorted operation takes a stream as input and returns a sorted stream
         * 
         * 5. Add another map operation to the pipeline
         * 
         * 6. Add a forEach operation to the pipeline
         *    - receives a stream and produces an output
         */

        List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

        prices.stream().filter(price -> {
            return price > 100;
        }).map(price -> {
            return price - 20;
        }).sorted((right, left) -> {
            return right.compareTo(left);
        }).map(price -> {
            return "$" + price;
        }).forEach(price -> {
            System.out.println(price);
        });

        //The code above can also be written as:
        prices.stream()
            .filter(price ->  price > 100)
            .map(price -> price - 20)
            .sorted((right, left) -> right.compareTo(left))
            .map(price -> "$" + price)
            .forEach(price -> System.out.println(price));

    }
}