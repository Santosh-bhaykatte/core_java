package core_Java.multithreading;

public class ThreadPlayground {
    public static void main(String[] args) throws InterruptedException {
        /*
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        };

         */
        Thread thread = new Thread(() -> System.out.println("Thread is running"));
        System.out.println("Thread state: "+ thread.getState());
        thread.start();
        System.out.println("Thread state: "+ thread.getState());
    }
}
