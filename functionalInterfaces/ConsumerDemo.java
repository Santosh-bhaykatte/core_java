/*

public interface Consumer<T> {
    void accept(T t);
}

* */

package core_Java.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class User {
    String name;

    public User(String name) {
        this.name = name;
    }
}

public class ConsumerDemo {
    //Method accepting Consumer
    static void displayMessage(String msg, Consumer<String> action) {
        action.accept(msg);
    }

    public static void main(String[] args) {
        /*
        Consumer<String> printer = (s) -> System.out.println("Msg: "+ s);
        printer.accept("Hello World");

        Consumer<Integer> doubler = (n) -> System.out.println("Double: "+ (n*2));
//        doubler.accept(10);

        Consumer<Integer> increment = (i) -> System.out.println("Increment: "+ (i+1));
//        increment.accept(5);

        doubler.andThen(increment).accept(20);

        //Consumer<T> for custom object
        Consumer<User> userConsumer = user -> System.out.println("Name: "+ user.name);
        userConsumer.accept(new User("John"));

        //use of Consumer<T> behind the scenes
        List<String> list = Arrays.asList("Santo", "Tony", "Mony");

        System.out.println("Names:");
        list.forEach(System.out::println);

        /*
        Internal Working:

        1. System.out::println      -Method reference

        2. Consumer<String> c = (s) -> System.out.println(s);       //Consumer Implementation

        3. c.accept(listElement)
         */

        displayMessage("Hello", (s) -> System.out.println(s.toUpperCase()));
        displayMessage("Santo", s -> System.out.println("Welcome "+ s));

    }
}
