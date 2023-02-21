import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /* Polymorphism in Lists
         * - ArrayList implements the List interface
         * - LinkedList implements the List interface
         * 
         * List
         * - is an Interface: defines methods required from a class
         * 
         * ArrayList vs. LinkedList
         * - Performance: LinkedList is usually the wrong choice
         * - ArrayList is faster
         * - ArrayList has direct references to every element
         * - LinkedList travels its length until it reaches element 'n'
         * - Polymorphism: ArrayList and LinkedList can take the form of the interface they implement
         */

        ArrayList<Integer> list = new ArrayList<Integer>();
        //methods called from the List interface
        list.add(1);
        list.add(2);
        list.size();
        list.isEmpty();
        //list.contains(3);
        list.toArray();    

        List<Integer> list2 = new LinkedList<Integer>();
        //methods called from the List interface
        list2.add(1);
        list2.add(2);
        list2.size();
        list2.isEmpty();
        list2.toArray();    
    }
}
