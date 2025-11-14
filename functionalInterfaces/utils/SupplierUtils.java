package core_Java.functionalInterfaces.utils;

import java.util.function.Supplier;

public class SupplierUtils {
    public static <T> T supply(Supplier<T> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {
        System.out.println(supply(() -> "Hello Supplier"));

        System.out.println("Random: "+ supply(() -> (int)(Math.random() * 100)));

        System.out.println(supply(() -> System.currentTimeMillis()));

        System.out.println("Primitve: "+ supply(() -> {
            String s = "123";
            return Integer.parseInt(s);
        }));
    }
}
