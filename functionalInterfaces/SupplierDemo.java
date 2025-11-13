/*

public interface Supplier<T> {
    T get();
}

* */

package core_Java.functionalInterfaces;

import java.util.function.Supplier;

class Student {
    String name;

    Student() {
        this.name = "tony";
        System.out.println("Student created!");
    }
}

public class SupplierDemo {
    //Method accepting Supplier
    static void getMessage(Supplier<String> supplier) {
        System.out.println("Value: "+ supplier.get());
    }

    public static void main(String[] args) {
        /*
        Supplier<String> greet = () -> "Hello Supplier!";
        System.out.println(greet.get());

        Supplier<Integer> random = () -> (int)(Math.random()*100);
        System.out.println("Random: "+ random.get());

        //Supplier<T> for custom object
//        Supplier<Student> studentSupplier = () -> new Student("Santo");

        Supplier<Student> studentSupplier = Student::new;   //Constructor reference

        Student student = studentSupplier.get();

         */

        getMessage(() -> "Hello Java");
        getMessage(() -> "Current time: "+ System.currentTimeMillis());
    }
}
