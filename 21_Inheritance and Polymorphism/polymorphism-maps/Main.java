import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//CHEAT SHEET: https://www.learnthepart.com/course/2dfda34d-6bbc-4bd5-8f45-d5999de2f514/c28e97d2-9174-491d-a209-0618c38e7ece

public class Main {
    public static void main(String[] args) {

        /* 
         * Map: HashMap, TreeMap, LinkedHashMap
         * - HashMap directly implements the Map interface
         * - LinkedHashMap is a child class of HashMap which indirectly implements the Map interface
         * - TreeMap implements the SortMap interface which intern implements the Map interface (TreeMap indirectly implements Map)
         * 
         * Map
         * - an interface: defines methods required from a class
         * 
         * HashMap vs. LinkedHashMap vs. TreeMap
         * - HashMap: not ordered
         * - LinkedHashMap and TreeMap follow an order
         * 
         * TreeMap
         * - TreeMap and Trees are sorted according to compareTo() method
         * 
         * LinkedHashMap
         * - entries are sorted based on insertion order
         * 
         * When to use a Map?
         * - when there is parity between data
         * 
         * When to use a HashMap?
         * - for performance, use a HashMap when order isn't important
         * - favour HashMap over other Maps
         * 
         * When to user a TreeMap?
         * - to sort entries according to what you specify
         * 
         * When to use LinkedHashMap?
         * - to sort entries according to insertion order
         */

        TreeMap<Book, String> books = new TreeMap<Book, String>();
        books.put(new Book("Harry Potter", "J.K. Rowling", 29.99), "SSBob3Bl");
        books.put(new Book("The Catcher in the Rye", "J. D. Salinger", 18.99), "dGhhdCB5b3UncmU=");
        books.put(new Book("Game of Thrones", "George RR Martin", 31.99), "ZW5qb3lpbmc=");
        books.put(new Book("The Alchemist", "Paulo Coelho", 14.99), "dGhlIGNvdXJzZSE=");

        //methods called from the Map interface (which is ovveriden by HashMap)
        // books.size();
        // books.isEmpty();
        // books.containsKey(new Book("Harry Potter", "J.K. Rowling", 29.99));
        // books.remove(new Book("Harry Potter", "J.K. Rowling", 29.99));

        printMap(books);
        System.out.println("\n" + books.keySet().toArray()[2]);
    }  

    public static void printMap(Map<Book, String> map) {
        map.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        });
    }
}
