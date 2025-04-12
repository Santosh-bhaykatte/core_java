package core_Java.example;

class Student {
    String name;
    int age;
    Student() {
        this("Tony", 55);   //this to call another constructor  - constructor chaining
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        print(this);    //pass this as argument to method
    }
    void print(Student student) {
        System.out.println("Name: "+ student.name +", Age: "+ student.age);
    }
}

class Counter {
    int count = 0;
    Counter increment() {
        this.count++;
        return this;    //return current instance from method
    }
    void display() {
        System.out.println("Total count: "+ this.count);
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();

        Counter counter = new Counter();
        counter.increment().increment().increment().display();      //method chaining
    }
}
