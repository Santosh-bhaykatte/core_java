package core_Java.multithreading.sync;

//Shared Resource Class
class SharedResource {
    int count = 0;
    //Synchronized Method
    public synchronized void synchronizedMethod(String message) {
        count++;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Non-synchronized method with synchronized block
    public void synchronizedBlock(String message) {
        synchronized (this) {
            count++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

//Thread class for shared resource access
class MyThread extends Thread {
    SharedResource resource;    //Aggregation
    String message;
    boolean useMethod;  // True for synchronized method, False for synchronized block

    public MyThread(SharedResource resource, String message, boolean useMethod) {
        this.resource = resource;
        this.message = message;
        this.useMethod = useMethod;
    }

    @Override
    public void run() {
        if(useMethod) {
            for (int i = 0; i < 5; ++i) {
                resource.synchronizedMethod(message);
            }
        } else {
            for (int i = 0; i < 5; ++i) {
                resource.synchronizedBlock(message);
            }
        }
    }
}

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource = new SharedResource();

        //Thread accessing synchronized method
        MyThread thread1 = new MyThread(sharedResource, "Thread-1", true);

        //Thread accessing synchronized block
        MyThread thread2 = new MyThread(sharedResource, "Thread-2", false);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Total count: "+ sharedResource.count);
    }
}
