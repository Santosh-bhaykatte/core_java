package core_Java.multithreading;

class ChildThread extends Thread {
    public ChildThread(ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
        start();
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +" is running");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadGroupDemo1 {
    public static void main(String[] args) {
        ThreadGroup parentThread = new ThreadGroup("parent-thread");

        ChildThread childThread1 = new ChildThread(parentThread, "child-1");
        ChildThread childThread2 = new ChildThread(parentThread, "child-2");

        System.out.println("Number of active threads running in ThreadGroup: "+ parentThread.getName() +" is "+ parentThread.activeCount());
    }
}
