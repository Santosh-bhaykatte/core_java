package core_Java.multithreading;

public class InterruptMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        });
        thread.start();
        thread.interrupt();
        thread.join();
        System.out.println("Main thread continues");
    }
}
