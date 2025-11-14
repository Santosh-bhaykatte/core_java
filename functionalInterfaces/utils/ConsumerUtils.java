package core_Java.functionalInterfaces.utils;

import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerUtils {
    public static <T> void act(T value, Consumer<T> action) {
        action.accept(value);
    }

    public static <T,R> R process(T input, Function<T,R> transformer, Consumer<R> afterAction) {
        R result = transformer.apply(input);
        afterAction.accept( result);
        return result;
    }

    public static void main(String[] args) {
        /*
        act("santo", (s) -> System.out.println("Upper: "+ s.toUpperCase()));
        act(10, (n) -> System.out.println("Double: "+ n * 2));
        act("Hello, World", System.out::println);

         */

        String output = process(
                "santo",
                (s) -> s.toUpperCase(),
                (r) -> System.out.println("Processed: "+ r)
        );
        System.out.println("Output: "+ output);
    }
}
