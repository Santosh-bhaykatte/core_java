package core_Java.anotherpackage;

//Why?
/* 1. Partial implementation - If the interface has multiple methods, but you want to provide default implementation for some of the methods, you can use abstract class.
- Subclasses can then inherit default implementation and only override the methods they need.

2. Common behaviour - If multiple classes implementing interface share common behaviour, you can define that behaviour in abstract class to avoid code duplication.

3. Flexibility - subclasses can choose to override the methods provided by abstract class or use default implementation.

4. Code reusability - common behaviour can be defined in abstract class and reused by multiple subclasses.

 */

/*  When to Use This Approach?

1. Shared Behavior: When multiple classes implementing the interface share common behavior.
2. Default Implementation: When you want to provide a default implementation for some methods of the interface.
3. Framework Design: When designing frameworks or libraries where you want to provide a base implementation for users to extend.

* */

/* When Not to Use This Approach?

1. Single Responsibility: If the interface has only one abstract method (e.g., functional interfaces), it’s better to use a concrete class or lambda expressions.
2. No Shared Behavior: If there is no shared behavior among implementing classes, using an abstract class may add unnecessary complexity.

* */

interface Vehicle {
    int WHEELS = 4;     //public static final
    final String BRAND = "TATA";

    //abstract methods
    void start();
    void stop();
    void honk();

    static void displayBrand() {    //static method
        System.out.println("Brand: "+ BRAND);
    }
}

abstract class AbstractVehicle implements Vehicle {
    String name;    //field
    AbstractVehicle(String name) {      //constructor
        this.name = name;
    }
    @Override
    public void start() {
        System.out.println("vehicle started.");
    }
    @Override
    public void stop() {
        System.out.println(name +" stopped.");
    }
    abstract public void honk();    //leave honk() as abstract for subclasses to implement
}

class Car extends AbstractVehicle {
    Car(String name) {
        super(name);    //call abstract class constructor
    }
    @Override
    public void start() {       //override default implementation of start()
        System.out.println(name +" started.");
    }
    @Override
    public void honk() {    //override abstract honk()
        System.out.println(name +" honking: beep beep!");
    }
}

class Truck extends AbstractVehicle {
    Truck(String name) {
        super(name);        //call abstract class constructor
    }
    @Override
    public void honk() {
        System.out.println(name +" honking: honk honk!");
    }
}

public class InterfaceWithAbstractClass {
    public static void main(String[] args) {
        Vehicle.displayBrand();     //call static method of interface
        System.out.println("Wheels: "+ Vehicle.WHEELS);

        Car car = new Car("nexon");
        car.start();
        car.honk();
        car.stop();
        System.out.println();

        Truck truck = new Truck("tempo");
        truck.start();
        truck.honk();
        truck.stop();
    }
}
