public class Strings {
    //empty Strings "" take up 24 bytes of memory
    public static void main(String[] args) {
        //use lowerCamelCase when naming variables
        int year = 2022;
        String winner = "Argentina";

        String message = "The winner of World Cup " + year + " was " + winner + ".";
        System.out.println(message);
    }
}