package core_Java.practice;

import java.util.Scanner;

public class ReverseSpiral {
    public static void inputArray(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements::");
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }
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
    }
}
