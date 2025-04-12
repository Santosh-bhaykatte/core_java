package core_Java.multithreading.sync;

// Shared resource class
class SharedResource {
    // Synchronized Method: Locks the entire method
    public synchronized void synchronizedMethod(String message) {
        System.out.print("[ "+ message);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(" ]");
    }
    // Non-Synchronized method with synchronized block
    public void synchronizedBlock(String message) {
        synchronized (this) {   // Locks only this block
            System.out.println("Thread "+ Thread.currentThread().getName() +" trying to enter synchronized block");

            System.out.print("[ "+ message);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(" ]");
        }
    }
}

// Thread class that calls synchronized methods
class MyThread extends Thread {
    SharedResource resource;
    String message;
    boolean useMethod;  // true for synchronized method, false for synchronized block

    public MyThread(SharedResource resource, String message, Boolean useMethod) {
        this.resource = resource;
        this.message = message;
        this.useMethod = useMethod;
    }

    @Override
    public void run () {
        if (useMethod) {
            resource.synchronizedMethod(message);
        } else {
            resource.synchronizedBlock(message);
        }
    }
}

public class SyncDemo {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Threads using synchronized method
        MyThread myThread1 = new MyThread(sharedResource, "synchronized method", true);
        MyThread myThread2 = new MyThread(sharedResource, "synchronized mehtod", true);

        // Threads using synchronized block
        MyThread myThread3 = new MyThread(sharedResource, "synchronized block", false);
        MyThread myThread4 = new MyThread(sharedResource, "synchronized block", false);

        // Start all threads
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
    }
}
