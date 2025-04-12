package core_Java.nested;

abstract class Animal {
    public abstract void makeSound();   //abstract method
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        //anonymous class implementing Runnable interface
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task is running in separate thread.");
            }
        };

        //create a thread and start it
        Thread thread = new Thread(task);
        thread.start();

        //anonymous class extending abstract class
        Animal dog = new Animal() {
            @Override
            public void makeSound() {
                System.out.println("Dog is barking.");
            }
        };
        //call the overridden method
        dog.makeSound();
    }
}
