package core_Java.anotherpackage;

interface Walkable {
    default void move() {
        System.out.println("Walking..");
    }
    default void run() {
        System.out.println("Running..");
    }
}
interface Swimmable {
    default void move() {
        System.out.println("Swimming..");
    }
    void quack();    //no default implementation
}
class Duck implements Walkable, Swimmable {
    @Override
    public void move() {
        Walkable.super.move();
        Walkable.super.run();
        System.out.println("Duck is walking");
    }
    @Override
    public void quack() {
        System.out.println("Duck makes sound..");
    }
}

public class MultipleInheritanceEx {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.move();
        duck.quack();
    }
}
