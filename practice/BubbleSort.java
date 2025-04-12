package core_Java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static void buubleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n-i-1; ++j) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter values: ");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }
        buubleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
