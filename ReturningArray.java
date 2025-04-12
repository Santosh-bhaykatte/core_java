package core_Java;

import java.util.Arrays;

public class ReturningArray {
    public static char[] getArr() {
        return new char[] {'a', 'b', 'c', 'd'};
    }
    public static void main(String[] args) {
        char[] arr = getArr();
        System.out.println(Arrays.toString(arr));
    }
}
