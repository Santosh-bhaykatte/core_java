package core_Java.multithreading;

public class ThreadDemo4 extends Thread {
    public ThreadDemo4(String name) {
        super(name);
    }
    public ThreadDemo4() {
        //default constructor
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; ++i) {
            System.out.println(Thread.currentThread().getName() +": Count "+ i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public void printName() {
        System.out.println("Name is Sonali");
    }
    public static void main(String[] args) {
        ThreadDemo4 thread1 = new ThreadDemo4();
        thread1.setName("child thread");
        thread1.start();

        ThreadDemo4 thread2 = new ThreadDemo4("grandChild thread");
        thread2.start();

        thread1.interrupt();    //interrupt child thread

        ThreadDemo4 threadDemo4 = new ThreadDemo4();
        threadDemo4.printName();
    }
}
