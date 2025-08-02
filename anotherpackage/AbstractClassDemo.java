package core_Java.anotherpackage;

abstract class Animal {
    //field
    String name;

    //constructor
    Animal(String name) {
        this.name = name;
    }

    //abstract method
    abstract void makeSound();

    //concrete method
    void sleep() {
        System.out.println(name +" is sleeping.");
    }
}

abstract class Dog extends Animal {
    Dog(String name) {
        super(name);    //call abstract class constructor
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Animal animal = new Dog("Shera") {  //anonymous class
            @Override
            public void makeSound() {
                System.out.println(name +" is barking.");
            }
        };
        animal.sleep();         //calls concrete method
        animal.makeSound();     //calls abstract method
    }
}
