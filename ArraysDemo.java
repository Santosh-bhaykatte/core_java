package core_Java;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        //declaration & instantiation
        int[] nums = new int[5];
        //initialization
        for(int i = 0; i < nums.length; ++i) {
            nums[i] = i+1;
        }

        //declare, instantiate and initialize
        int[] arr = {2, 3, 4, 6, 7};
        int[] newArr = new int[] {3, 4, 5, 6};
        System.out.println("new array: "+ Arrays.toString(newArr));

        /*
        //print
        System.out.print("Array: ");
        for(int i = 0; i < nums.length; ++i) {
            System.out.print(nums[i] +" ");
        }

         */

        // foreach loop
        System.out.print("Array: ");
        for(int i : nums) {
            System.out.print(i +" ");
        }

        System.out.println();
        System.out.println("Array: "+ Arrays.toString(nums));
    }
}
