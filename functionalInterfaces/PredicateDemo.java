/*

public interface Predicate<T> {
    boolean test(T t);
}

* */

package core_Java.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// functional Interface
@FunctionalInterface
interface PersonCreator {
    Person getPerson(int age, String name, long salary);
}

class Person {
    int age;
    String name;
    long salary;

    public Person(int age, String name, long salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
}

public class PredicateDemo {
    //generic filter method
    static void filter(List<Integer> list, Predicate<Integer> condition) {
        for (Integer i : list) {
            if (condition.test(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        /*
        Predicate<Integer> isPositve = n -> n > 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;

        Predicate<String> isLong = s -> s.length() > 5;

        Predicate<String> startsWithA = s -> s.startsWith("A");
        Predicate<String> endsWithZ = s -> s.endsWith("Z");

        System.out.println(isPositve.test(10));
        System.out.println(isEven.test(7));
        System.out.println(isLong.test("Santosh"));

        System.out.println(startsWithA.and(endsWithZ).test("AshZ"));
        System.out.println(isPositve.or(isEven).test(-2));

        System.out.println("isOdd: "+ isEven.negate().test(7));

         */

        //__________________________________________________

        /*
//        PersonCreator p = (sal) -> new Person(sal);       //Lambda expression
        PersonCreator p = Person::new;                      //Method reference
        Person newPerson = p.getPerson(21, "tony", 60000);

        //Predicate<T> for custom object

        Predicate<Person> checkSalary = (person) -> person.salary > 50000;
        Predicate<Person> checkAge = (person) -> person.age > 18;

//        System.out.println(checkSalary.test(newPerson));

        boolean isValidPerson = checkAge.and(checkSalary).test(newPerson);
        System.out.println("isValidPerson: "+ isValidPerson);

         */

        //__________________________________________________

        //passing conditions as objects to method
        List list = List.of(2, -1, 45, -10, 8 ,80);
        List list1 = Arrays.asList(2, 3, 4, 6, 5, 7, 9);

        System.out.println("Positive numbers:");
        filter(list, (n) -> n > 0);     //filter positive numbers

        System.out.println("Even numbers:");
        filter(list1, n -> n % 2 == 0); //filter even numbers

        System.out.println("Prime numbers:");   //filter prime numbers
        filter(list1, (n) -> {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); ++i) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            boolean res = (isPrime) ? true : false;
            return res;
        });

    }
}
