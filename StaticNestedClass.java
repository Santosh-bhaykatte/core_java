package core_Java;

//1. static nested class is static member of outer class
//2. It can be accessed without creating instance of outer class
//3. It can not access non-static members of outer class directly

public class StaticNestedClass {
    public static void main(String[] args) {
        //create instance of inner class to access non-static method
        Outer.Inner inner = new Outer.Inner();
        inner.display();

        //access static method
        Outer.Inner.print();
    }
}

class Outer {
    static int x = 10;
    static class Inner {    //static nested class
        void display() {
            System.out.println("Value of x: "+ x);
        }
        static void print() {
            System.out.println("Value of x: "+ x);
        }
    }
}
