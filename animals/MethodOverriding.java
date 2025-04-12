package core_Java.animals;

class Animal {
    void makeSound() {
        System.out.println("Animal makes sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Dog makes sound");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
