package core_Java.practice;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-10, 8, -6, 4, 2, -1, -3, -5};
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; ++i) {
            int currSum = 0;
            for (int j = i; j < arr.length; ++j) {
                currSum += arr[j];
                maxSum = Math.max(currSum, maxSum);
            }
        }
        System.out.println("Max subarray sum: "+ maxSum);
    }
}
