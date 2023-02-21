public class SingleThread {

    /* CONCURRENCY
     * - goal of concurrency is to help application perform faster
     * - Concurrency: making progress on more than one task at a time.
     * - Multithreading: can help achieve concurrency
     * 
     * Serial Execution
     * - running tasks one at a time
     * 
     * Concurrent Execution
     * - making progress on more than one task at a time
     * - can be achieved with multithreading
     */

    public static void main(String[] args) {
        longTask();
        System.out.println("Doing other work on main thread");

    }

    public static void longTask() {
        long t = System.currentTimeMillis();
        long end = t+3000;

        while(true) {
            if (System.currentTimeMillis() == end) {
                System.out.println("Finished long task");
                break;
            }
        }
    }
}
