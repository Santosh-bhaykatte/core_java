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

* IMPORTANT Utility Methods:

1. valueOf() - Converts primitive or string to respective wrapper object
            e.g     Integer a = Integer.valueOf(12);
            *       Double d = Double.valueOf(3.4);
            *       Long l = Long.valueOf("1245456");

2. intValue()  - Converts wrapper object to primitive
            int a = Integer.valueOf(12).intValue();
            double d = Double.valueOf(2.3).doubleValue();
            long l = Long.valueOf("8383981").longValue();

3. parseInt()   - Converts string to primitive
            int a = Integer.parseInt("233");
            double d = Double.parseDouble("245.67");

4. toString()   -   converts primitive or wrapper object to string
                String str1 = Integer.toString(123);
                String str2 = Double.toString(Double.valueOf(3.14));
* */


public class WrapperClass {
    public static void main(String[] args) {
        //Autoboxing: Conversion of primitive data type to wrapper class object
        Integer a = 10;     //int -> Integer
        Double b = 5.67;    //double -> Double

        //Unboxing: Conversion of wrapper object to primitive
        int num4 = new Integer(20);     //Integer to int
        double num5 = new Double(5.1);      //Double to double
        float num15 = new Float(4.5F);  //Float to float

        //wrapper class object creation
        Integer num6 = new Integer(30);     //not recommended
        Integer num16 = Integer.valueOf(10);    //Better space & time performance
        Double num17 = Double.valueOf(3.14);
        String str1 = String.valueOf(12.3);
        String str2 = Double.toString(4.5);

        //valueOf() -> converts primitive or string to wrapper object
        Integer num7 = Integer.valueOf(40);     //int to Integer

        String str = "70";
        int num8 = Integer.parseInt(str);   //converts string to primitive
        byte num9 = Byte.parseByte("2");
        double num18 = Double.parseDouble("3746.34");

        String num10 = Integer.toString(10);    //converts primitive or wrapper object to string
        String num11 = Double.toString(new Double(4.5));
        String num12 = Double.toString(Double.valueOf("6.7"));
        String num13 = Long.toString(Long.valueOf(127637474));
        String num19 = Integer.toString(Integer.valueOf("123"));

        int num14 = Integer.valueOf(89).intValue();     //converts wrapper object to primitive
        int num20 = new Integer(90).intValue();
    }
}
