public class NestedLoops {
    public static void main(String[] args) {
        // nested loop - has an outer loop and an inner loop
        //  - useful when working with 2D arrays

        for (int i = 0; i < 3; i++) {
            System.out.println("run: " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println(j);
            }
        }
    }
}
