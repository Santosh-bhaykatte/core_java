package core_Java;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        //copy array using System.arraycopy()
        int[] copyFrom = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] copyTo = new int[5];

        //System.arraycopy(Object src, srcPos, Object dest, destPos, length);
        System.arraycopy(copyFrom, 2, copyTo, 0, 5);
        System.out.println(Arrays.toString(copyTo));
        System.out.println(String.valueOf(copyTo));
    }
}
