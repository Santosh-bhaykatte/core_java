/*

🧠 What makes these generic utilities powerful?

✔ No code duplication
✔ You pass behavior, not just data
✔ Extremely flexible
✔ Highly reusable
✔ Cleaner and shorter code
✔ Used everywhere in modern Java
✔ Perfect for Spring Boot, microservices, and enterprise apps

* */


package core_Java.functionalInterfaces.utils;

import java.util.function.Predicate;

public class PredicateUtils {
    public static <T> boolean validate(T value, Predicate<T> condition) {
        return condition.test(value);
    }
    public static void main(String[] args) {
        System.out.println(validate(10, (val) -> val > 0)); // true
        System.out.println(validate("santo", (s) -> s.length() >= 5));
        System.out.println(validate(5, (n) -> n % 2 == 0));
    }
}
