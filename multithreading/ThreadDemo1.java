package core_Java.multithreading;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 1 is running!");
    }
}

class AnotherThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread 2 is running!");
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();   // Create an instance
//        thread1.run();
        thread1.start();     // Create new thread & start it
        System.out.println("Main thread is running");

        AnotherThread anotherThread = new AnotherThread();
        Thread thread2 = new Thread(anotherThread);
        thread2.start();
        System.out.println("Main thread is still running");
    }
}
