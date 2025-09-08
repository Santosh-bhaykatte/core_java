package core_Java.multithreading.inter_thread_communication;

// Logging using multithreading
public class Logger {
    private static StringBuffer logbuffer = new StringBuffer();

    public static synchronized void log(String message) {
        logbuffer.append(Thread.currentThread().getName()).append(" : ").append(message).append("\n");
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i <= 3; ++i) {
                log("Logging event: "+ i);
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Log Message: "+ logbuffer.toString());
    }
}
