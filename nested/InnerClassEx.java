package core_Java.nested;

//local Inner class
//1. A local inner class is defined inside a method, constructor, or block of the outer class.
//2. It can only be accessed within the scope where it is defined.
//3. It has access to the members of the outer class and local variables (if they are final or effectively final).

//Anonymous Inner Class
//1. An anonymous inner class is a class without a name, defined and instantiated in a single statement.
//2. It is often used to override methods of a class or interface.

interface Greeting {
    void greet();
    void hello();
}

class Outer {
    private int outerVar = 10;
    private static int staticOuterVar = 20;
    class Inner {
        void display() {
            System.out.println("Outer variable: "+ outerVar);
        }
    }
    static class Nested {
        void display() {
            System.out.println("Outer static variable: "+ staticOuterVar);
        }
    }
    void outerMethod() {
        int localVar = 30; //Effectively final
        class LocalInner {      //local inner class
            void display() {
                System.out.println("Local variable: "+ localVar);   //Access local variable
            }
        }
        LocalInner localInner = new LocalInner();
        localInner.display();
    }
}

public class InnerClassEx {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();      //access inner class
        inner.display();

        Outer.Nested nested = new Outer.Nested();       //access static nested class
        nested.display();

        outer.outerMethod();        //access local inner class

        // anonymous inner class
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, World!");
            }

            @Override
            public void hello() {
                //Empty implementation
            }
        };

        greeting.greet();

    }
}
