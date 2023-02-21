package product;

public class Pants extends Product {

    //super.member : can access a member of the parent class

    private int waist;
    private int length;

    public Pants(double price, String color, String brand, int waist, int length) {
        // super() calls the parent constructor to update inherited fields
        // child constructor updates the remaining fields
        super(price, color, brand);
        this.waist = waist;
        this.length = length;
    }

    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    /* @Override
     * - ensures you are actually overriding a parent method
     * - the child class provides its own implementation of a method
     */
    @Override
    public void fold() {
        super.fold();
        System.out.println("\nHold pants upright..");
        System.out.println("Fold one leg over the other..");
        System.out.println("Fold pants from bottom in thirds.");
    }

    @Override
    public void wear() {
        System.out.println("The " + waist + ", " + length + " pants look great on you!");
    }
}
