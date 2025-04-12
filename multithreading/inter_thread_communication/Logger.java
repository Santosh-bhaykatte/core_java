package core_Java.multithreading.inter_thread_communication;

public class Logger {
    private static StringBuffer logBuffer = new StringBuffer();
    public static synchronized void log(String message) {
        logBuffer.append(Thread.currentThread().getName()).append(": ").append(message).append("\n");
    }
    public static void main(String[] args) throws InterruptedException {
        /*
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; ++i) {
                    log("Logging event "+ i);
                }
            }
        };
         */
        Runnable task = () -> {
            for (int i = 0; i < 5; ++i) {
                log("Logging event "+ i);
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(logBuffer.toString());
    }
}
