package core_Java.mypackage;

interface Animal {
    void makeSound();   //abstract method - public abstract implicitly
    default void sleep() {  //default method
        System.out.println("Animal is sleeping");
    }
    static void info() {    //static method
        System.out.println("This is Animal interface");
    }
    int LEGS = 4;   //public static final implicitly
}

public class Interface {
    public static void main(String[] args) {
        /*
        Animal dog = new Animal() {     //anonymous class
            @Override
            public void makeSound() {
                System.out.println("Dog makes sound");
            }
        };

         */

        Animal dog = () -> System.out.println("Dog makes sound");

        dog.makeSound();
        dog.sleep();
        System.out.println("no. of legs: "+ Animal.LEGS);
    }
}
