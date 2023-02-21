public class MultiThread {

    //HOW TO CREATE A NEW THREAD
    /* 
    Thread thread = new Thread(Runnable task)
    * 1. Create a new Thread object.
    * 2. Give the thread a Runnable task
    */

    /* Thread State
     * - a thread can have many states during its lifetime
     * 
     * Thread can be NEW
     * - which means thread has been initializedd but not started
     * 
     * RUNNABLE
     * - thread has started
     * 
     * TERMINATED
     * - thread has died (finished)
     */

    /* Interupting a Thread
     * - Thread.interupt() changes the status of the thread
     * 
     * Thread.sleep()
     * - stops a thread for X milliseconds
     * - throws an InterruptedException when interrupted
     */

    public static void main(String[] args) {

        //create object of anonymous class
        /* 
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                longTask();
            }
        };
        Thread thread2 = new Thread(runnable);
        */

        //lambda expression for creating thread2
        Thread thread2 = new Thread(() -> longTask());
        System.out.println(thread2.getState()); // returns NEW

        //to run thread, start() invokes run() method
        thread2.start();
        System.out.println(thread2.getState()); // returns RUNNABLE

        System.out.println("BIG ERROR OCCURED IN MAIN THREAD. INTERUPTING BACKGROUND THREAD.");
        //thread2.interrupt(); // only changes status of thread
        //System.out.println(thread2.isInterrupted());

        System.out.println("Doing other work on main thread");
        
    }

    public static void longTask() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Done Sleeping");
        }

        /* 
        long t= System.currentTimeMillis();
        long end = t+3000;

        while(true) {
            if (System.currentTimeMillis() == end) {
                System.out.println("Finished long task");
                break;
            } else if (Thread.currentThread().isInterrupted()) {
                System.out.println("This task has been interupted prematurely.");
                break;
            }
        }
        */
    }

}
