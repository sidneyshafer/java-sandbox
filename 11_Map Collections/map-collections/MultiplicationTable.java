import java.util.Map;
import java.util.TreeMap;

public class MultiplicationTable {
    public static void main(String[] args) {

        /* Map
         * - HashMap: stores an unordered collection of key-value pairs
         * - TreeMap: stores an ordered collection of key-value pairs
         */

        /* TreeMap
         * - sorts entries in ascending key order
         * - the time to retrieve data depends on the tree depth
         */

        /* Final Verdict
         * - use HashMap if you don't care about order
         * - Hashmaps provide fast-look up access becayse hashing a key locates the index of an entry
         * - only use TreeMap if you need the entries to be sorted
         * - TreeMap sorts entries in ascending key order
         */

        //create a new TreeMap
        Map<Integer, Integer> tree = new TreeMap<>();

        int multiplier = 5;
        tree.put(1, multiplier*1);
        tree.put(2, multiplier*2);
        tree.put(3, multiplier*3);
        tree.put(4, multiplier*4);
        tree.put(5, multiplier*5);
        tree.put(6, multiplier*6);
        tree.put(7, multiplier*7);
        tree.put(8, multiplier*8);
        tree.put(9, multiplier*9);
        tree.put(10, multiplier*10);

        System.out.println("\nWhat is 4 multiplied by " + multiplier);
        System.out.println(tree.get(4));

        System.out.println("\nWhat is 7 multiplied by " + multiplier);
        System.out.println(tree.get(7));

        System.out.println("\nWhat is 3 multiplied by " + multiplier);
        System.out.println(tree.get(3));


        System.out.println("\nDoes the table reach 20?");
        String response = tree.containsKey(20) ? "Yes!" : "No, sorry!";
        System.out.println(response);


    }
}
