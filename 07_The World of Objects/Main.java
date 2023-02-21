import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Object :
         * - things that contains fields
         * - thing that can perform tasks
         * - a class is a blueprint from which you can create an object
         */

        //create an instance(object) of the Car class
        /* 
        Car nissan = new Car();
        nissan.make = "Nissan";
        nissan.price = 10000;
        nissan.year = 2019;
        nissan.color = "Red";

        Car dodge = new Car();
        dodge.make = "Dodge Charger";
        dodge.price = 11000;
        dodge.year = 2020;
        dodge.color = "Black";
        */

        //initialize array in single line
        //arrays are mutable objects - avoid setting variables equal to each other
        String[] spareParts = new String[] {"Tires", "Keys", "Engine"};

        //create an object using a constructor
        Car audi = new Car("Audi R6", 100000, 2022, "Blue", spareParts);
        Car nissan = new Car("Nissan", 10000, 2019, "Red", spareParts);
        Car dodge = new Car("Dodge Charger", 11000, 2020, "Black", new String[] {"Keys", "Radio"});

        String[] carParts = nissan.getParts();
        carParts[0] = "Radio";

        spareParts[0] = "Filter";

        /* Mutable Object
        * - an object with setters
        */
        //both nissan and nissan2 share the same reference to the same object
        //--> DO NOT DO : Car nissan2 = nissan;
        //avoid setting two objects equal to eachother

        //Call the copy constructor - now nissan and nissan2 two are two different objects
        Car nissan2 = new Car(nissan);

        nissan2.setColor("Fuchsia");
        nissan.setColor("Beige");

        /* 
        nissan.setColor("Jet Black");
        dodge.setYear(2021);
        nissan.setPrice(nissan.getPrice() / 2);
        */

        /*

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + 
        ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");

        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + 
        ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");

        System.out.println("This " + audi.getMake() + " is worth $" + audi.getPrice() + 
        ". It was built in " + audi.getYear() + ". It is " + audi.getColor() + ".\n");

        System.out.println("This " + nissan2.getMake() + " is worth $" + nissan2.getPrice() + 
        ". It was built in " + nissan2.getYear() + ". It is " + nissan2.getColor() + ".\n");

        System.out.println(nissan);
        System.out.println(dodge);

        audi.drive();

        */

        Scanner scan = new Scanner(System.in);

        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };

        Dealership dealership = new Dealership(cars);

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");        
        System.out.println("Feel free to browse through our collection of cars.\n");
        System.out.println(dealership);
        System.out.println("Which car are you interested in? (0 - 4).\n");
        int index = scan.nextInt();

        // sell car here...
        dealership.sellCar(index);

        scan.close();
    }
}