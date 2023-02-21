import model.Car;
import static model.Car.TrafficLight.*;

public class Main {

    /* Enums
     * - use enums when a variable is limited to a set of values
     * - you will be able to catch errors at compile-time, rather than runtime
     * - use CamelCase to name enum variable
     */

    public static void main(String[] args) {
        Car car = new Car("Nissan", 2020);
        car.drive(RED);
    }

}
