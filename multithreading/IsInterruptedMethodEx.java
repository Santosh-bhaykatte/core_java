package core_Java.multithreading;

public class IsInterruptedMethodEx {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println( Thread.currentThread().getName() +" is runnig");
            }
            System.out.println("Thread was interrupted");
        }, "new thread");

        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread priority: "+ thread.getPriority());

        thread.start();
        System.out.println("Thread is alive: "+ thread.isAlive());
        System.out.println("Main thread continues");

        Thread.sleep(1);     //Let the thread run for a while
        thread.interrupt();

        thread.join();
        System.out.println("Thread is alive: "+ thread.isAlive());
        System.out.println("Main thread continues again");
    }
}
