public class LoopingArrays {
    public static void main(String[] args) {
        String[] kingdoms = {"Merica", "Wessex", "Northumbria", "E A"};

        System.out.println("The number of elements is: " + kingdoms.length);

        for (int i = 0; i < kingdoms.length; i++) {
            System.out.println(kingdoms[i]);
        }
    }
}
