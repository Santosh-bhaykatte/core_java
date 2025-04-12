class SharedDataRunnable implements Runnable {
    private int counter = 0; // Shared data

    @Override
    public void run() {
        synchronized (this) { // Synchronize access to shared data
            for (int i = 0; i < 3; i++) {
                counter++; // Modify shared data
                System.out.println("Thread " + Thread.currentThread().getName() +
                        ": Counter = " + counter);
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class FutureVisit {
    public static void main(String[] args) {
        SharedDataRunnable sharedRunnable = new SharedDataRunnable(); // Single instance

        Thread thread1 = new Thread(sharedRunnable, "Thread-1");
        Thread thread2 = new Thread(sharedRunnable, "Thread-2");

        thread1.start();
        thread2.start();
    }
}