package core_Java.multithreading.inter_thread_communication;

class SharedBuffer {
    private int data;
    private boolean hasData = false;

    //Method to produce data
    public synchronized void produce(int data) throws InterruptedException {
        while (hasData) {   //Buffer full - wait
            wait();
        }
        this.data = data;
        hasData = true;
        System.out.println("Produced: "+ data);
        notify();   //Wake up consumer
    }

    //Method to consume data
    public synchronized void consume() throws InterruptedException {
        while (!hasData) {      //Buffer empty - wait
            wait();
        }
        System.out.println("Consumed: "+ data);
        hasData = false;
        notify();   //Wake up producer
    }
}

public class InterThreadDemo1 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        //Producer thread
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; ++i) {
                try {
                    buffer.produce(i);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }, "producer");

        //Consumer Thread
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; ++i) {
                try {
                    buffer.consume();
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }, "consumer");

        producer.start();
        consumer.start();
    }
}
