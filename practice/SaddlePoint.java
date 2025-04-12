package core_Java.practice;

// Saddle point

import java.util.Arrays;

public class SaddlePoint {
    public static void main(String[] args) {
        int[][] arr = {
                {4, 2, 3},
                {13, 0, 11},
                {10, 1, 2}
        };

        int saddlePoint;
        int col = -1;

        for (int i = 0; i < 3; ++i) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            // Find min element in row
            for (int j = 0; j < 3; ++j) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    col = j;
                }
            }

            // Find max element in col
            for (int k = 0; k < 3; ++k) {
                if (arr[k][col] > max) {
                    max = arr[k][col];
                }
            }
            // Compare min with max
            if (min == max) {
                saddlePoint = min;
                System.out.println("saddle point: "+ saddlePoint);
            }
        }
    }
}
