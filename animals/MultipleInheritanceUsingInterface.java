package core_Java.animals;

interface Aquatic {
    default void move() {
        System.out.println("moving..");
    }
}

interface Walkable extends Aquatic {
    @Override
    default void move() {
        Aquatic.super.move();
        System.out.println("Walking..");
    }
}
interface Swimmable extends Aquatic {
    @Override
    default void move() {
        System.out.println("Swimming..");
    }
}
class Duck implements Walkable, Swimmable {
    @Override
    public void move() {
        Walkable.super.move();
        Swimmable.super.move();
        System.out.println("Duck is moving..");
    }
}

public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.move();
    }
}
