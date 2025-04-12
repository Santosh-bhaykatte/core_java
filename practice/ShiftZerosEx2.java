package core_Java.practice;

import java.util.Arrays;
import java.util.Scanner;
import static core_Java.practice.ShiftZerosEx1.inputArr;

public class ShiftZerosEx2 {
    static void leftShiftOperation(int[] arr, int index) {
        for (int j = index; j < arr.length-1; ++j) {
            arr[j] = arr[j+1];
        }
    }
    static void rearrangeArr(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if (arr[j] == 0) {
                    leftShiftOperation(arr, j);
                    arr[arr.length-1] = 0;
                    --n;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements: ");

        //Input array
        inputArr(arr);

        rearrangeArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}
