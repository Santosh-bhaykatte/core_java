package core_Java.com.example;

public class Outer {
    //static nested class
    private static class Inner {
        void display() {
            System.out.println("static Inner class -> from non-static method");
        }
        static void print() {
            System.out.println("static Inner class -> from static method");
        }
    }
    //non-static nested class (Inner class)
    private class AnotherInner {
        void display() {
            System.out.println("inner class -> from non-static method");
        }
        static void print() {
            System.out.println("inner class -> from static method");
        }
    }
    public static void main(String[] args) {
        //create instance of static nested class - does not require an instance of inner class
        Outer.Inner inner = new Outer.Inner();

        //access non-static method from static nested class
        inner.display();

        //access static method from static nested class
        Outer.Inner.print();

        // ***********************************************************

        //create instance of non-static inner class - requires an instance of outer class
        Outer outer = new Outer();
        Outer.AnotherInner anotherInner = outer.new AnotherInner();

        //access non-static method from inner class
        anotherInner.display();

        //access static method from inner class
        AnotherInner.print();
    }
}
