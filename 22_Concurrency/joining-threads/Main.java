import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Main {

    /* Joining Threads
     * 
     * Thread.join()
     * - allows a thread to wait for another thread
     */

    /* Callable and FutureTask
     * - used to catch a final result
     * - Runnable's run() method is void 
     * - Callable's call() method returns a result
     * - If a task reutns a result, use a Callable
     * - Must specify callable type
     * 
     * FutureTask implements the Runnable interface
     * - FutureTask has get() method which grabs the result
     */

    /* Thread Pool
     * - a group of threads
     * - favor thread pools over creating multiple threads for each task
     * 
     * Ideal Thread Pool Size
     * - for CPU bound tasks, a good estimation is:
     * numberOfThreads = numberOfCorse available
     */


    static double[] targets = new double[] {0.5, 0.8, 0.3};
    static final double PRECISION = 0.0000001;
    static double result = 0;

    public static void main(String[] args) {

        //get number of cores available
        int numThreads = Runtime.getRuntime().availableProcessors(); // returns 8

        //create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        //submit tasks to thread pool
        //returns a future value
        Future<Double> future = executor.submit(() -> generateNumber(0));
        Future<Double> future2 = executor.submit(() -> generateNumber(1));
        Future<Double> future3 = executor.submit(() -> generateNumber(2));

        /* 
        FutureTask<Double> future = new FutureTask<>(() -> generateNumber(0));
        Thread thread = new Thread(future);

        FutureTask<Double> future2 = new FutureTask<>(() -> generateNumber(1));
        Thread thread2 = new Thread(future2);

        FutureTask<Double> future3 = new FutureTask<>(() -> generateNumber(2));
        Thread thread3 = new Thread(future3);
        
        
        thread.start();
        thread2.start();
        thread3.start();
        */

        try {
            future.get();
            future2.get();
            future3.get();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //shutdown executer service
            executor.shutdown();
        }

        //double precision = difference(result);

        System.out.println("Finished running background operations.");
    }

    /**
     * Function name: generateNumber
     * @return double
     * 
     * Inside the function:
     *   1. Generates a number close to the TARGET to a precision of PRECISION.
     * 
     */
    public static double generateNumber(int index) {
        double number = Math.random();
        double difference = difference(number, index);
        while (difference > PRECISION) {
            number = Math.random();
            difference = difference(number, index);
        }
        return number;
    }

    public static double difference(double number, int index) {
        return Math.abs(targets[index] - number);
    }

}
