package core_Java.example;

/*
Wrapper classes in Java are a set of classes that provide a way to use primitive data types (e.g., int, char, boolean) as objects. Each primitive data type has a corresponding wrapper class. Wrapper classes are part of the java.lang package and are used extensively in collections, generics, and other scenarios where objects are required instead of primitives.
 */

//Why Use Wrapper Classes?
/*
* Wrapper classes are used in scenarios where objects are required instead of primitives:

Collections:
Java collections (e.g., ArrayList, HashMap) can only store objects, not primitives.

Generics:
Generics in Java work only with objects, not primitives.

Utility Methods:
Wrapper classes provide utility methods for converting between primitives and strings, parsing, and more.

Null Values:
Wrapper classes can hold null values, whereas primitives cannot.
* */


public class WrapperClassDemo {
    public static void main(String[] args) {
        //Autoboxing: primitive to wrapper object
        Integer num1 = 10;      //int to Integer
        Double num2 = 3.14;     //double to Double

        //Unboxing: wrapper object to int
        int num4 = new Integer(20);     //Integer to int
        double num5 = new Double(5.1);      //Double to double

        //wrapper class object creation
        Integer num6 = new Integer(30);     //not recommended

        //valueOf() -> converts primitive or string to wrapper object
        Integer num7 = Integer.valueOf(40);     //int to Integer

        String str = "70";
        int num8 = Integer.parseInt(str);   //converts string to primitive
        byte num9 = Byte.parseByte("2");

        String num10 = Integer.toString(10);    //converts primitive or wrapper object to string
        String num11 = Double.toString(new Double(4.5));
        String num12 = Double.toString(Double.valueOf("6.7"));

        int num14 = Integer.valueOf(89).intValue();     //converts wrapper object to primitive
        int num15 = new Integer(90).intValue();
    }
}
