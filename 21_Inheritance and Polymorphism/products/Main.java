import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import models.Pants;
import models.Product;
import models.Shirt;

public class Main {

    /* extends
    * - a class that extends another class inherits from it
    */

    /* When two classes share common fields:
    * - never define the same fields in each class
    * - each class should inherit common fields from a Parent class
    * - the child class uses its constructor to update its fields
    * - the child class uses the Parent constructor to update inherited fields
    * 
    * super
    * - refers to the superclass (Parent class)
    * 
    * super()
    * - refers to the parent class constructor
    * 
    * super.method()
    * - calls a method from the Parent class
    * 
    * A child class can inherit getters and setters from Parent class
    * 
    * abstract class:
    * - you can create an object of a concrete class
    * - you CANNOT create an object of an abstract class
    * - make a class abstract if its only purpose is inheritance
    * 
    * this.method vs. super.method
    * - 'this' can call local and inherited methods
    * - 'super' can only call inherited methods
    * 
    * abstract methond
    * - if a parent class defines an abstract method, the child class must override it
    * - abstract method does not have a body in the parent class
    *
    * Define an abstract method as:
    * 1. level of access (i.e. public, private)
    * 2. abstract keyword
    * 3. return type (i.e. void, double, string, etc.)
    * 4. parameters
    */
    
    /* Enums
     * - an enum contains a limited number of constants
     * - use an enum to ensure something can be a limited number of values
     * - an enum defines a collection of static final constants
     */

    /* Interface
     * - an interface defines a method that a class needs to implement
     * - if a class implements an interface, it must override every method inside the interface
     * - an interface is a contract that defines methods that a class must implement
     * - interfaces allows for polymorphism
     * 
     * The Comparable Interface
     * - you can sort objects that implement the Comparable interface
     * - the sort() method can sort Comparable objects
     * - sort() uses compareTo to sort comparable objects
     * - Comparable interface defines one method : compareTo() --> must override
     */
  
    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {

        /*
        Shirt shirt = new Shirt(Shirt.Size.SMALL, 5.99, "Blue", "AE");
        Pants pants = new Pants(25, 24.99, "White", "Old Navy");
        Shirt shirt2 = new Shirt(shirt);
        Pants pants2 = new Pants(pants);
        Pants pants3 = new Pants(30, 100.99, "Red", "KLEIN");

        System.out.println(shirt.getPrice());
        //pants.setPrice(49.99);

        System.out.println(shirt.equals(shirt2));
        //objects that are equal MUST share the same hashCode
        System.out.println(shirt.hashCode());
        System.out.println(shirt2.hashCode());
        System.out.println("\n");

        System.out.println(shirt);
        System.out.println(pants);

        System.out.println("\n");

        shirt.fold();
        System.out.println("\n");

        pants.fold();
        System.out.println("\n");

        pants2.discount();
        System.out.println(pants2.getPrice());
        System.out.println("\n");

        System.out.println(pants3.compareTo(pants));
        System.out.println(pants.compareTo(pants2));

        /* 
        Product[] products = new Product[] {
            new Shirt("MEDIUM", 8.99, "Yellow", "Cotton On"),
            new Pants(27, 32.99, "Blue", "Khols"),
        };
        */

        /* 
        Product[] products = new Product[] {
            new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
            new Pants(34, 104.99, "Red", "JANGLER"),
            new Pants(30, 119.99, "Grey", "FENDI"),
            new Pants(30, 129.99, "Red", "VERSACE"),
            new Pants(29, 99.99, "Dark", "JANGLER"),
            new Pants(26, 24.99, "Indigo", "BELSTAFF"),
            new Pants(34, 104.99, "Red", "JANGLER"),
        };
        */

        /* 
        Product[] products = new Product[] {
            new Pants(32, 24.99, "Blue", "JAVA KLEIN"),
            new Shirt(Shirt.Size.MEDIUM, 22.99, "Black", "CHANEL"),
            new Pants(34, 104.99, "Red", "JANGLER"),
            new Shirt(Shirt.Size.SMALL, 13.99, "Orange", "GEORGE"),
            new Pants(30, 119.99, "Grey", "FENDI"),
            new Shirt(Shirt.Size.LARGE, 34.99, "Blue", "ECKO"),
            new Pants(30, 129.99, "Red", "VERSACE"),
            new Shirt(Shirt.Size.SMALL, 22.99, "Beige", "ZARA"),
            new Pants(29, 99.99, "Dark", "JANGLER"),
            new Shirt(Shirt.Size.SMALL, 19.99, "Red", "NIKE"),
            new Pants(26, 24.99, "Indigo", "BELSTAFF"),
            new Shirt(Shirt.Size.LARGE, 29.99, "Blue", "ADIDAS"),
            new Pants(34, 104.99, "Red", "JANGLER"),
        };

        Arrays.sort(products);
        printArray(products);
       
       */

       try {
            Product[] products = getData();
            Arrays.sort(products);
            for (int i = 0; i < products.length; i++) {
                System.out.println(products[i]);
            }
       } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
       }
    }

    public static void printArray(Product[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);   
        }
    }
  
    /**
     * Function Name: getData
     * @return Product[]
     * @throws FileNotFoundException
     * 
     * Inside the function:
     *   1. Loads the data from products.txt
     */

    public static Product[] getData() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        Scanner scan = new Scanner(fis);

        Product[] products = new Product[18];

        //populate products[] with Shirts and Pants from products.txt
        for (int i = 0; scan.hasNextLine(); i++) {
            switch (scan.next()) {
                case "PANTS": products[i] = new Pants(scan.nextInt(), scan.nextDouble(), scan.next(), scan.next());
                case "SHIRT": products[i] = new Shirt(Shirt.Size.valueOf(scan.next()), scan.nextDouble(), scan.next(), scan.next());
            }
        }

        scan.close();
        return products;
    }
}
