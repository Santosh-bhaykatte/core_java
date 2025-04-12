package core_Java.multithreading;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("AnotherMyRunnable is running");
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        System.out.println("Main thread is running");
        AnotherMyRunnable myRunnable = new AnotherMyRunnable();

        Thread thread1 = new Thread(myRunnable);
        thread1.start();

        Thread thread2 = new Thread(myRunnable);
        thread2.start();

        System.out.println("main thread finished executing!");
    }
}
