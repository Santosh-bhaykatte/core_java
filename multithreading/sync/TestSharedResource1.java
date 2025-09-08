/*
* In Java, each object has a single intrinsic lock (monitor).

* When a thread enters a synchronized method on that object, it acquires the object’s lock.

* While one thread holds the lock, no other thread can enter any synchronized method (or block) of the same object.

* Other threads trying to call any synchronized method on that object must wait until the lock is released.

👉 So, synchronized methods of the same object are mutually exclusive.
* */

package core_Java.multithreading.sync;

class SharedResource1 {
    public synchronized void methodA() {
        String tname = Thread.currentThread().getName();
        System.out.println(tname +" entering methodA");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(tname +" exiting methodA");
    }

    public synchronized void methodB() {
        String tname = Thread.currentThread().getName();
        System.out.println(tname +" entering methodB");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(tname +" exiting methodB");
    }
}

public class TestSharedResource1 {
    public static void main(String[] args) throws InterruptedException {
        SharedResource1 resource1 = new SharedResource1();

        SharedResource1 resource2 = new SharedResource1();
        SharedResource1 resource3 = new SharedResource1();

        Thread t1 = new Thread(() -> resource1.methodA(), "Thread-1");
        Thread t2 = new Thread(() -> resource1.methodB(), "Thread-2");

        Thread t3 = new Thread(() -> resource2.methodA(), "Thread-3");
        Thread t4 = new Thread(() -> resource3.methodB(), "Thread-4");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        t3.start();
        t4.start();
    }
}
