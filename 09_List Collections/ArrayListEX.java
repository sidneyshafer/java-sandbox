import java.util.*;

public class ArrayListEX {

    public static void main(String[] args) {
        /* ArrayLists :
         * - prefered method of storing data in a collection
         * - ArrayList and LinkedList do not have a fixed size
         * - backed bt an underlying array
         * - has the capacity to dynamically resize
         * 
         * - fast at retrieving elements
         * - fast at operations from the end of the list
         * - slow at adding/removing elements from the middle
         */

        // create cities ArrayList;
        List<String> cities = new ArrayList<>();

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