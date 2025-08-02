package core_Java.animals;

interface Aquatic {
    String HABITAT = "Water";
    default void move() {
        System.out.println("moving..");
    }
    static void info() {
        System.out.println("Aquatic animal");
    }
    default void sound() {
        System.out.println("Makes sound");
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

public class MultipleInheritance {
    public static void main(String[] args) {
        Aquatic duck = new Duck();
        duck.move();
        Aquatic.info();
        System.out.println(Aquatic.HABITAT);
        duck.sound();
    }
}
