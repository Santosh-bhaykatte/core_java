package core_Java.practice;

import java.util.Scanner;

public class PairSum {
    static void pairSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i+1; j < arr.length; ++j) {
                int sum = arr[i] + arr[j];
                if (sum == target) {
                    System.out.println("["+ arr[i] +" "+ arr[j] +"]");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter sorted elements: ");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        pairSum(arr, target);
    }
}
