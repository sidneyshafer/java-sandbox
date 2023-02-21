public class BreakAndContinue {
    public static void main(String[] args) {
        // continue keyword - skips a run, and continues to the next one
        // break keyowrd - breaks the loop

        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i); // only prints even numbers
        }

        System.out.println();

        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                break;
            }
            System.out.println(i); // only prints even numbers
        }
    }
}
