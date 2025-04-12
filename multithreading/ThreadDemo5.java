package core_Java.multithreading;

class MyNewThread extends Thread {
    public MyNewThread(String name) {
        super(name);
        start();
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

public class ThreadDemo5 {
    public static void main(String[] args) {
        MyNewThread thread1 = new MyNewThread("Thread-1");
        MyNewThread thread2 = new MyNewThread("Thread-2");
        MyNewThread thread3 = new MyNewThread("Thread-3");

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
