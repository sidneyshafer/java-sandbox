public class Parameters {
    public static void main(String[] args) {
        //Parameters
        /*
         * - functions with parameters expect to receive values
         * - function without parameters do not expect to receive values
         * - parameters store a value that your function expects to receive
         */

        //Argument
        /*
         * - a value that you pass into a function
         */
        calculateArea(2.3, 3.5);
        calculateArea(1.6, 2.4);
    }

    public static void calculateArea(double length, double width) {
        double area = length * width;
        System.out.println("Area: " + area);
    }
}
