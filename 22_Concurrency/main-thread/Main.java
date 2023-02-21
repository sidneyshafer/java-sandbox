public class Main {
    public static void main(String[] args) {

        //CPU, Cores, and Threads
        /*
         * CPU
         * - Processor: uses processing units called cores to process instructions
         * - Most computers only have ONE CPU chip
         * CORE:
         * - can process instructions
         * - think of a core as a worker
         * 
         * - code is written on a Thread -> thread is then sent to CPU where cores process it and performs instructions based on what the thread provides
         * - the more Cores you have, the more threads can be processed at one time
         * 
         * 
         * THREAD
         * - Path of execustion
         * - Instructions in your app run on a thread
         * -**Every application that has been built so far has been single-threaded** -> the Main thread
         *  
         * Multi-threaded applications run on many threads
         * - different parts of code are running at the same time on multipls threads
         * 
         * The main thread
         * - your app is single-threaded by default
         * - your code runs on the main thread
         * 
         * Limitations of Single-Threaded Applications
         * - by default, every application has a main thread
         * - a single-threaded app runs everything on the main thread
         * - long-running tasks should not block the main thread
         * long running tasks should run on another thread
         */

        longTask();
        System.out.println("Doing other work on main thread");

    }

    public static void longTask() { //takes 3 seconds to perform this task.
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
