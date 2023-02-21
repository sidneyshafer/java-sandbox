import java.util.Arrays;

public class Car {

    //fields
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    /* Constructor :
     * - runs as soon as you create an object
     * - purpose is to update an object's fields
     * - keyword 'this' refers to the current object
     * --- purpose of 'this' is to distinguish between fields and parameters
     */


    public Car() {}

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    //create a copy constructor - defines one parameter
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    /* Getters
     * - a public method
     * - return type depends of particular field
     */

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String[] getParts() {
        return Arrays.copyOf(this.parts, this.parts.length);
    }

    /* Setters
     * - a public method to set an objects fields
     * - expects to recieve a parameter whose type depends on the field itself
     */

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    //drive method
    public void drive() {
        System.out.println("\nYou bought the beautiful " + this.year + " " + this.color + " " + this.make + " for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.");
    }

    //override default toString() method
    @Override
    public String toString() {
        return "Make: " + this.make + ".\n" 
            +  "Price: " + this.price + ".\n"
            +  "Year: " + this.year + ".\n"
            +  "Color: " + this.color + ".\n"
            +  "Parts: " + Arrays.toString(parts) + ".\n";
    }
}
