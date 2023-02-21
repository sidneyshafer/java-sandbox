import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        /* 
         * - LinkedLists are differenct in how it stores data compared to ArrayList
         * - retrieving data from a LinkedList is very slow compared to an ArrayList
         * - ArrayList and LinkedList do not have a fixed size
         * - They are different in how they store data
         * 
         * LinkedList :
         * - is a chain of nodes
         * - each node is linked to the previous and next node
         * 
         * Which one is more efficient?
         * - ArrayList: retrieving elements
         * - LinkedList: adding/removing elements from the middle
         */

        List<String> cities = new LinkedList<>();

        cities.add("Paris");
        cities.add("Florence");
        cities.add("Venice");
        cities.add("Versailles");
        cities.add("London");
        cities.add("Petra");
        cities.add("Oslo");
        cities.add("Rome");
        cities.add("Madrid");
        cities.add("Tokyo");
        cities.add("Prague");
        cities.add("Dublin");
        cities.add("Athens");
        cities.add("Marseille");
        cities.add("Chicago");

        System.out.println(cities.size());
        System.out.println(cities.get(5));
        System.out.println(cities.get(8));
        cities.set(2, "Naples");
        cities.remove(5);
    }
}
