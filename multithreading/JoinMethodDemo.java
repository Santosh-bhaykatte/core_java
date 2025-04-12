package core_Java.multithreading;

public class JoinMethodDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Thread finished.");
        });
        thread.start();
        thread.join();  //Wait for this thread to terminate
        System.out.println("Main thread continues.");
    }
}
