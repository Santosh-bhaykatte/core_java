package core_Java.multithreading;

class AnotherMyRunnable implements Runnable {
    private int counter = 0;    // Shared state
    @Override
    // Tasks to be executed by threads
    public void run() {
        for (int i = 0; i < 3; ++i) {
            counter++;
            System.out.println("Thread: "+ Thread.currentThread().getName() +": Counter "+ counter);

            try {
                Thread.sleep(100);      // Waits for 100ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadDemo3 {
    public static void main(String[] args) {
        // Create a single instance of AnotherMyRunnable
        AnotherMyRunnable myRunnable = new AnotherMyRunnable();

        // Create multiple threads using the same Runnable instance
        Thread thread1 = new Thread(myRunnable, "Thread-1");
        Thread thread2 = new Thread(myRunnable, "Thread-2");
        Thread thread3 = new Thread(myRunnable, "Thread-3");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
