public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        System.out.println("\nTemps at noon :");
        printTemperatures(noon);

        System.out.println("\nTemps during the evening :");
        printTemperatures(evening);

        System.out.println("\nTemps at midnight :");
        printTemperatures(midnight);
        
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }

    public static void printTemperatures(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("\tF: " + fahrenheit);
        System.out.println("\tC: " + celsius);
    }
}