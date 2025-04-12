package core_Java;

public class Constructor {
    //inner class
    public class Person {
        String name;
        int age;

        //default constructor
        /*
        Person() {
            name = null;
            age = 0;
        }
         */

        //no argument constructor
        Person() {
            name = "unknown";
            age  = 0;
        }

        //parameterized constructor
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        Person(String name) {
            this.name = name;
        }

        //getter
        void display() {
            System.out.println(name +" "+ age);
        }
    }
    public static void main(String[] args) {
        Constructor c = new Constructor();
        Person p = c.new Person();
        p = c.new Person("Santo");
        p = c.new Person("Tony", 25);
        p.display();
    }
}
