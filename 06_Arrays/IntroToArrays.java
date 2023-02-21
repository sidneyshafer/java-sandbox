public class IntroToArrays {
    public static void main(String[] args) {
        //int[] numbers = { 1, 2, 3 };
        String[] kingdoms = {"Merica", "Wessex", "Northumbria", "E A"};

        //index out of range - cannot access an index that doesn't exist

        String kingdom1 = kingdoms[0];
        String kingdom2 = kingdoms[1];
        String kingdom3 = kingdoms[2];
        String kingdom4 = kingdoms[3];
        System.out.println(kingdom1); //Merica
        System.out.println(kingdom2); //Wessex
        System.out.println(kingdom3); //Northumbria
        System.out.println(kingdom4); //E A

    }
}