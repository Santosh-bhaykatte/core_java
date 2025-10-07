package core_Java.bitManipulation;

public class ClearBits {
    static int clearIBits(int n, int i) {
//        int bitMask = -1<<i;
//        return n & bitMask;
        int bitMask = (1<<i)-1;
        return n & ~bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIBits(10, 2));
    }
}
