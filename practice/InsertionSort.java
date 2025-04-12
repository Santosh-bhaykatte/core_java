package core_Java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {       // Start from the second element
            int key = arr[i];   // Pick the element to insert
            int j = i-1;

            // Shift the elements that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }

            // Place the key at the correct position
            arr[j+1] = key;
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
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
