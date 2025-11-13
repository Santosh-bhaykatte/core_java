/*

public interface Function<T, R> {
    R apply(T t);
}

*
* */

package core_Java.functionalInterfaces;

import java.util.function.Function;

class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }
}

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> square = (n) -> n * n;   //square
        System.out.println(square.apply(5));

        Function<String, Integer> lengthFinder = (s) -> s.length();     //length of String
        System.out.println(lengthFinder.apply("Santosh"));

        Function<Integer, Integer> multiply = (n) -> n * 2;
        Function<Integer, Integer> add = (n) -> n + 3;

        System.out.println(multiply.andThen(add).apply(10));    //A -> B
        System.out.println(multiply.compose(add).apply(5));     //B -> A

        //Function<T, R> for custom object
        Employee employee = new Employee("Tony");

        Function<Employee, String> nameExtracter = (employee1) -> employee1.name;
        System.out.println("name: "+ nameExtracter.apply(employee));
    }
}
