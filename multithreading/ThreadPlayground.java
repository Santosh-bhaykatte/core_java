package core_Java.multithreading;

public class ThreadPlayground {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> System.out.println("Thread is running"));
        System.out.println("Thread State: "+ thread.getState());    //NEW
        thread.start();
        System.out.println("Thread State: "+ thread.getState());    //RUNNABLE
    }
}
