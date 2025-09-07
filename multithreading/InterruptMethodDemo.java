package core_Java.multithreading;

public class InterruptMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(100);
                System.out.println("Thread woke up naturally");
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted while sleeping");
            }
            System.out.println("Thread finished execution");
        });
        thread.start();
        thread.interrupt();
        thread.join();
        System.out.println("Main thread continues");
    }
}
