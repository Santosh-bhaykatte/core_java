package core_Java;

public class PassingArraysToMethod {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 6, 0};
        //pass array to method
        System.out.println("Minimum: "+ findMin(arr));
    }
}
