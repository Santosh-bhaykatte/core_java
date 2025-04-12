package core_Java.practice;

import java.util.Arrays;
import java.util.Scanner;
import static core_Java.practice.ShiftZerosEx1.inputArr;

public class ShiftZerosEx3 {
    static void rearrangeArr(int[] arr) {
        int n = arr.length;;
        int insertPos = 0;      // position to insert non-zero elements

        for (int i : arr) {
            if (i != 0) {
                arr[insertPos++] = i;
            }
        }

        // insert all zeros to the end
        while (insertPos < n) {
            arr[insertPos++] = 0;
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
