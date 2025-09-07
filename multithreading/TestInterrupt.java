package core_Java.multithreading;

class NewThread extends Thread {
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Working...");
        }
        System.out.println("Thread exiting gracefully");
    }
}

public class TestInterrupt {
    public static void main(String[] args) throws InterruptedException {
        NewThread newThread = new NewThread();
        newThread.start();

        Thread.sleep(2000);
        newThread.interrupt();
    }
}
