package models;

import java.util.Objects;

public class Shirt extends Product {

    public enum Size {
        SMALL, MEDIUM, LARGE
    }
    private Size size;

    public Shirt(Size size, double price, String color, String brand) {
        super(price, color, brand);
        this.size = size;
    }

    // copy constructor
    public Shirt(Shirt source) {
        super(source);
        this.size = source.size;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void fold() {
        System.out.println("1. Lay shirt on a flat surface");
        System.out.println("2. Fold shirt sideways");
        System.out.println("3. Bring sleeves in");
        System.out.println("4. Fold from the bottom up");
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Shirt)) {
            return false;
        }
        Shirt shirt = (Shirt) o;
        return size.equals(shirt.size) 
        && super.getPrice() == shirt.getPrice()
        && super.getColor().equals(shirt.getColor()) 
        && super.getBrand().equals(shirt.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, super.getPrice(), super.getColor(), super.getBrand());
    }

    @Override
    public String toString() {
        return "{" +
            " size='" + getSize() + "'" +
            " price='" + super.getPrice() + "'" +
            " color='" + super.getColor() + "'" +
            " brand='" + getBrand() + "'" +
            " }";
    }

}
