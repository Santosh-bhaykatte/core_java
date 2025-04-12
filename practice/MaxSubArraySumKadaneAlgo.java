package core_Java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubArraySumKadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; ++i) {
            currSum = currSum + arr[i];
            maxSum = Math.max(currSum, maxSum);

            if (currSum < 0) {
                currSum = 0;    // reset to zero only if currSum is negative
            }
        }
        System.out.println("Max Sum: "+ maxSum);
    }
}
