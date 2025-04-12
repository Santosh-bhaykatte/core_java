package core_Java;

import java.util.Arrays;

public class AnonymousArray {
    public static String display(int[] arr) {
        return Arrays.toString(arr);
    }
    public static void main(String[] args) {
        //anonymous array in method call
        System.out.println("Array: "+ display(new int[] {1, 2, 3, 4, 5}));
    }
}
