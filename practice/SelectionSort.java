package core_Java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            int minIdx = i;         //assume first unsorted element as smallest
            for (int j = i+1; j < n; ++j) {     // get smallest element in unsorted part
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[i];      // swap ith element with smallest element found
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
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
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
