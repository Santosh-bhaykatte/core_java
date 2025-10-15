/*
transient -

modifier in java
tells serialization mechanism
fields with transient will not be serialized

* */

package core_Java;

import java.io.*;

class Demo implements Serializable {
    int id;
    transient String password;

    public Demo(int id, String password) {
        this.id = id;
        this.password = password;
    }
}

public class TransientDemo {
    public static void main(String[] args) throws Exception {
        Demo demo = new Demo(101, "secret");

        //Serialize object
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.obj"));
        oos.writeObject(demo);
        oos.close();

        //Deserialize object
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.obj"));
        Demo demo1 = (Demo) ois.readObject();
        ois.close();

        System.out.println("Id: "+ demo1.id);
        System.out.println("Password: "+ demo1.password);
    }
}
