package core_Java.mypackage;

@FunctionalInterface
interface Greeting {
    void greet(String name);   //abstract method
    default void sayHello() {
        System.out.println("Hello!");
    }
}

public class FunctionalInterfaceEx {
    public static void main(String[] args) {
        Greeting greeting = (name) -> System.out.println("Name: "+ name);   //lambda expression
        /*
        Greeting greeting = new Greeting() {    //anonymous class
            @Override
            public void greet(String name) {
                System.out.println("Name: "+ name);
            }
        }
         */
        greeting.greet("Santosh");
        greeting.sayHello();
    }
}
