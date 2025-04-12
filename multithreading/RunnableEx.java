package core_Java.multithreading;

class DemoThread implements Runnable {
    Thread thread;
    public DemoThread(String name) {
        thread = new Thread(this, name);
        thread.start();
    }
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; ++i) {
                System.out.println(Thread.currentThread().getName() +": Count "+ i);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class RunnableEx {
    public static void main(String[] args) {
        DemoThread thread1 = new DemoThread("Thread-1");
        DemoThread thread2 = new DemoThread("Thread-2");
        DemoThread thread3 = new DemoThread("Thread-3");

        try {
            for (int i = 1; i <= 3; ++i) {
                System.out.println(Thread.currentThread().getName() +": Count "+ i);
                Thread.sleep(900);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
