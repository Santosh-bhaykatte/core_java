package core_Java.multithreading;

class AnotherChildThread1 implements Runnable {
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

public class ThreadGroupDemo3 {
    public static void main(String[] args) {
        ThreadGroup parentThread = new ThreadGroup("parent-thread-group");
        parentThread.setMaxPriority(Thread.MAX_PRIORITY);

        ThreadGroup childThread = new ThreadGroup(parentThread, "child-group");

        AnotherChildThread1 runnable1 = new AnotherChildThread1();

        Thread thread1 = new Thread(parentThread, runnable1, "child-1");
        Thread thread2 = new Thread(parentThread, runnable1, "child-2");
        Thread thread3 = new Thread(childThread, runnable1, "grand-child-1");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Number of active threads running in ThreadGroup: "+ parentThread.getName() +" is "+ parentThread.activeCount());
        System.out.println("Number of active groups in ThreadGroup: "+ parentThread.getName() +" is "+ parentThread.activeGroupCount());
        System.out.println("parent of "+ childThread.getName() +": "+ childThread.getParent().getName());

        parentThread.list();
    }
}
