package core_Java;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        //declare, instantiate, initialize and print
        int[][] arr = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] newArr = {
                {4, 5, 6},
                {7, 8, 9},
                {2, 5, 1}
        };

        //print using for loop
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();

        //using for each loop
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
