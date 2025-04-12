package core_Java.multithreading;

public class Main {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        new Thread (() -> {
            System.out.println("new thread running");
            try {
                Thread.sleep(50);   // Waits for 50ms
                mainThread.interrupt();     //Interrupt the main thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        try {
            Thread.sleep(100);  // Main thread sleeps for 100ms
            System.out.println("Thread slept successfully.");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted: "+ e.getMessage());
        }
        System.out.println("program continues to run");
    }
}
