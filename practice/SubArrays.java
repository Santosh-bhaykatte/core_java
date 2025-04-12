package core_Java.practice;

import java.util.Scanner;

public class SubArrays {
    static void subArrays(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i; j < arr.length; ++j) {
                System.out.print("[");
                for (int k = i; k <= j; ++k) {
                    System.out.print(arr[k] +" ");
                }
                System.out.print("]  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter values: ");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }
        subArrays(arr);
    }
}
