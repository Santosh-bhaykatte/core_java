/*
* 👉 Serialization = The process of converting a Java object into a byte stream

so that it can be:

Saved to a file
Sent over a network
Stored in a database

In other words:
Turning an in-memory object → into a format that can be stored or transferred.

* ________________________________________________________________________________

* 👉 Deserialization = The process of converting a byte stream back into a Java object.

* */

package core_Java;

import java.io.*;

class Employee implements Serializable {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SerializationDemo {
    public static void main(String[] args) throws Exception {
        Employee emp1 = new Employee(101, "Santosh");

        //Serialization
        FileOutputStream fos = new FileOutputStream("employee.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(emp1);
        oos.close();
        System.out.println("object serialized!");

        //Deserialization
        FileInputStream fis = new FileInputStream("employee.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee emp = (Employee) ois.readObject();
        ois.close();

        System.out.println("object deserialized!");
        System.out.println("ID: "+ emp.id +", Name: "+ emp.name);
    }
}
