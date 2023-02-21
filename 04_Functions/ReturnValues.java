public class ReturnValues {
    public static void main(String[] args) {
        //Return Values
        /*
         * - bad practice for function to handle final result
         * - good practice for function to return the final result
         * - function must define a return type and return a value
         */

        double area1 = calculateArea(2.3, 3.5);
        double area2 = calculateArea(1.6, 2.4);
        //double area3 = calculateArea(-5, 2.3);

        // System.out.println("Area: " + area1);
        // System.out.println("Area: " + area2);
        printArea(2.3, 3.5, area1);
        printArea(1.6, 2.4, area2);

        String English = explainArea("English");
        // String French = explainArea("French");
        // String Spanish = explainArea("Spanish");
        // String Italian = explainArea("Italian");

        System.out.println(English);
        // System.out.println(French);
        // System.out.println(Spanish);
        // System.out.println(Italian);
    }

    //Value-returning function
    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("INVALID DIMENSIONS");
            System.exit(0);
        }
        return length * width;
    }

    //Value-returning function
    public static String explainArea(String language) {
        
        switch (language) {
            case "English": return "Area equals length * width"; //do not need break keyword
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * ancho";
            default: return "Language not available";
        }
    }

    //Void function - does not return anything when it performs its task
    public static void printArea(double length, double width, double area) {
        System.out.println("A rectangle with a length of " + length + " and a width of " + width +
         " has an area of " + area);
    }
}
