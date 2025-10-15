/*
Reflection in Java is a mechanism that allows your program to inspect and manipulate classes, methods, fields, and constructors at runtime — even if you don’t know their names at compile time.c

Reflection = “Examining and modifying the structure and behavior of a class at runtime.”

_______________________________________________________________________
But with reflection, you can:

1. Load a class by name (even if you don’t have its .class at compile time)
Class<?> clazz = Class.forName("core_Java.Student")

2. Create its object
Object obj = clazz.getDeclaredConstructor().newInstance();

3. Access fields
var field_name = clazz.getDeclaredField("field_name")
field_name.setAccessible(true)      //Access to private fields

4. Set fields
field_name.set(obj, value)

5. Get method
var method = clazz.getMethod("method-name")

6. Invoke method
method.invoke(obj)      //Invokes method on object

Access its methods or fields
Invoke them dynamically


* */

package core_Java;

class NewStudent {
    private int id;
    private String name;

    public NewStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: "+ id +", Name: "+ name);
    }
}

public class ReflectionExample {
    public static void main(String[] args) throws Exception {
        //Load class dynamically
        Class studentClass = Class.forName("core_Java.NewStudent");

        //Create object at runtime
        Object obj = studentClass.getDeclaredConstructor().newInstance();

        //Access private field
        var id = studentClass.getDeclaredField("id");
        var name = studentClass.getDeclaredField("name");

        id.setAccessible(true);     //Allow access to private fields
        name.setAccessible(true);

        id.set(obj, 101);           //Set fields
        name.set(obj, "Santosh");

        //Invoke method
        var method = studentClass.getMethod("display");
        method.invoke(obj);     //Calls display() on that object
    }
}
