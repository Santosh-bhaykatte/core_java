package core_Java;

public class ArrayIndexOutOfBoundsExceptionEx {
    public static void main(String[] args) {
        int[] nums = new int[5];
        //initialize
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = i+1;
        }
        try {
            int x = nums[6];
            System.out.println("x: "+ x);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
