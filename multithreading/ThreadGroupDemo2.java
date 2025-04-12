package core_Java.multithreading;

class AnotherChildThread implements Runnable {
    Thread t;
    public AnotherChildThread(ThreadGroup threadGroup, String name) {
        t = new Thread(threadGroup, this, name);
        t.start();
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

public class ThreadGroupDemo2 {
    public static void main(String[] args) {
        ThreadGroup parentThread = new ThreadGroup("parent-thread-group");
        parentThread.setMaxPriority(Thread.MAX_PRIORITY);

        AnotherChildThread thread1 = new AnotherChildThread(parentThread, "child-1");
        AnotherChildThread thread2 = new AnotherChildThread(parentThread, "child-2");

        System.out.println("Number of active threads running in ThreadGroup: "+ parentThread.getName() +" is "+ parentThread.activeCount());
        System.out.println("Thread group priority: "+ parentThread.getMaxPriority());
    }
}
