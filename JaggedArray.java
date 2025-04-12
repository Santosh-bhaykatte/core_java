package core_Java;

import java.util.Arrays;

public class JaggedArray {
    public static int[][] getArr() {
        //Jagged Array
        int[][] arr = new int[3][];

        //Instantiate each row with array of columns
        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[4];

        //Initialize
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = i+j+1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        //get array
        int[][] arr = getArr();

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(Arrays.toString(getArr()));
    }
}
