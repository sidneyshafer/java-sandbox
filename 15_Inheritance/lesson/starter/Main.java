import product.Shirt;
//import product.Shirt.Size;
import static product.Shirt.Size.*;
import product.Product;

import product.Pants;

public class Main {

    public static void main(String[] args) {

        /* Inheritance
         * - favors code reuse
         * - it allows you to define a parent class that serves a foundation for child classes
         * - every child class inherits fields/methods from its parent
         * - use the 'extend' keyword
         */

        /* Polymorphism
         * - allows for flexible and reusable code
         * - the ability of an object to take on multiple forms
         * - a child can take the form of its parent
         * Why do we need polymorphism?
         * - flexible and reusable code
         */

        /* abstract
         * - abstract keyword is used to create abstract classes and methods
         * - abstract class: a class you cannot create objects from
         * - abstract method: exposes behavior that a child must override
         * - you can only define an abstract method inside of an abstract class
         */

        /* The Object Class
         * - the root parent of every other class in Java
         * - defines equals() toString() hashCode() getClass()
         * - all objects inherit from the Object Class
         */

        Shirt shirt = new Shirt(10.99, "Red", "Nike", SMALL);

        shirt.fold();

        System.out.println(shirt);

        Pants pants = new Pants(49.99, "Black", "Levi's", 32, 32);

        pants.fold();

        productStore(shirt);
        productStore(pants);

    }

    public static void productStore(Product product) {
        System.out.println("\nThank you for purchasing the " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + ". Your total is $" + product.getPrice());
        product.wear();
    }

}
