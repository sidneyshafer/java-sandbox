import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    /* Reentrant Lock
     * - use reentrant locks to enforce thread safety
     * - when multithreading, critical code needs to be locked
     * - code is accessed in serial code, meaning one at a time
     * 
     * Race Condition
     * - incorrect result from too many threads updating the same thing
     * 
     * Critical Code
     * - code that is vulnerable to race conditions
     */

    /* Countdown Latch
     * - makes it easy to wait for multiple threads
     * - allows a parent thread to await other threads
     * - latch.await()
     */

    /* Atomic Types
     * - atomic allows for syncronized updates across multiple threads
     * - cleaner than locking
     * - favor atomic types over locks
     */
    
    static AtomicInteger counter = new AtomicInteger(0);
    
    public static void main(String[] args) {

        //countdown should be consistent with amount of tasks being executed
        CountDownLatch latch = new CountDownLatch(11);
        ReentrantLock lock = new ReentrantLock();

        int nThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(nThreads);

        for (int i = 0; i < 11; i++) {
            executor.submit(() -> task(lock, latch));
        }

        // Thread thread1 = new Thread(() -> task(lock, latch));
        // Thread thread2 = new Thread(() -> task(lock, latch));
        // Thread thread3 = new Thread(() -> task(lock, latch));
        // Thread thread4 = new Thread(() -> task(lock, latch));
        
        // thread1.start();
        // thread2.start();
        // thread3.start();
        // thread4.start();

        try {
            // thread1.join();
            // thread2.join();
            latch.await();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            executor.shutdown();
        }

        System.out.println(counter);
    }
    
    public static void task(ReentrantLock lock, CountDownLatch latch) {
        for (int i = 0; i < 10000; i++) {
            //lock.lock();
            counter.addAndGet(1); //counter = counter + 1;
            //lock.unlock();
        }
        latch.countDown();
    }
  
}
