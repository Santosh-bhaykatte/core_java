package core_Java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Spiral2dArray {
    public static void inputArray(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements::");
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    public static void printSpiralArray(int[][] arr, int rows, int cols) {
        int top = 0, left = 0, bottom = rows-1, right = cols-1;

        System.out.print("Spiral: [");
        // Traverse array
        while (left <= right || top <= bottom) {
            // left -> right
            for (int i = left; i <= right; ++i) {
                System.out.print(arr[top][i] +" ");
            }
            ++top;

            // top -> bottom
            for (int i = top; i <= bottom; ++i) {
                System.out.print(arr[i][right] +" ");
            }
            --right;

            // right -> left
            for (int i = right; i >= left; --i) {
                System.out.print(arr[bottom][i] +" ");
            }
            --bottom;

            // bottom -> top
            for (int i = bottom; i >= top; --i) {
                System.out.print(arr[i][left] +" ");
            }
            ++left;
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Input 2d array
        inputArray(arr);


        printSpiralArray(arr, rows, cols);
    }
}
