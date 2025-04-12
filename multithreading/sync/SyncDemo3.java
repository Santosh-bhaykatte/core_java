package core_Java.multithreading.sync;

class Counter {
    private int count = 0;

    // Method to increment counter
    public void increment() {
        synchronized (this) {
            ++count;
            System.out.println(Thread.currentThread().getName() +": count "+ count);
        }
    }
}

public class SyncDemo3 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread("thread-1") {
            public void run() {
                for (int i = 1; i <= 3; ++i) {
                    counter.increment();
                }
            }
        };

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 3; ++i) {
                counter.increment();
            }
        }, "thread-2");

        t1.start();
        t2.start();
    }
}
