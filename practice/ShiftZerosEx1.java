package core_Java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftZerosEx1 {
    static void inputArr(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }
    }
    static int countZero(int[] arr) {
        int cnt = 0;

        for (int i : arr) {
            if (i == 0) {
                ++cnt;
            }
        }
        return cnt;
    }
    static int[] rearrangeArr(int[] arr) {
        int n = countZero(arr);
        int[] temp = new int[arr.length];

        int j = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                ++j;
            }
        }

        for (int i = 0; i < n; ++i) {
            temp[j] = 0;
            ++j;
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter elements: ");

        //Input array
        inputArr(arr);

        System.out.println(Arrays.toString(rearrangeArr(arr)));
    }
}
