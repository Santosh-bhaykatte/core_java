package core_Java.strings;

/*  Best Practices for Working with Strings

1. Use StringBuilder or StringBuffer for Frequent Modifications

2. Avoid repeated string concatenation in loops.

3. Use equals() for String Comparison - checks for content equality

4. Use string literals for common strings to take advantage of the String Pool.

5. Avoid Unnecessary String Creation:
Be cautious with methods like substring() and concat() that create new objects.

6. Use intern() to ensure strings are added to the String Pool when necessary

* */

public class StringPlayground {
    public static void main(String[] args) {
        //string literals
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
//        System.out.println(str1 == str2);   //true - str1 & str2 point to same object
//        System.out.println(str1 == str3);   //false - str1 & str3 point to different objects

        String str4 = new String("Hello").intern();     //ensures string literal is present in String Constant Pool
//        System.out.println(str2 == str4);    //true

//        System.out.println(str1.equals(str3));  //true  - compares actual content

        str2 = str2.concat(", World");
//        System.out.println(str1 == str2);

        String joined = String.join(", ", "A", "B", "C");
//        System.out.println(joined);

        str1 = str1.replace('l', 'L');
//        System.out.println(str1);

        System.out.println(str4.equalsIgnoreCase(str1));    //true
    }
}
