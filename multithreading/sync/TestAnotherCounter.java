package core_Java.multithreading.sync;

class AnotherCounter {
    private int count = 0;  //Shared Resource

    public void incrementCount() {
        synchronized (this) {
            count++;
        }
    }
    public int getCount() {
        return count;
    }
}

public class TestAnotherCounter {
    public static void main(String[] args) throws InterruptedException {
        AnotherCounter anotherCounter = new AnotherCounter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; ++i) {
                anotherCounter.incrementCount();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Total count: "+ anotherCounter.getCount());
    }
}
