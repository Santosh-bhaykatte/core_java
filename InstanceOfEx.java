package core_Java;

import java.util.Arrays;
import java.util.List;

class AnotherAnimal { }
class AnotherDog extends AnotherAnimal { }

public class InstanceOfEx {
    public static void main(String[] args) {
        // Checking type before casting (safe casting) - avoids ClassCastException
        Object obj = "Santo";

        if (obj instanceof String) {
            String s = (String) obj;
            System.out.println(s.toUpperCase());
        }

        // Polymorphism & Method Overriding - useful when working with inheritance and interfaces.
        AnotherAnimal animal = new AnotherDog();

        if (animal instanceof AnotherDog) {
            System.out.println("It's Dog");
        }

        // Collections

        // Pattern matching
        obj = "Pattern Matching";

        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }
}
