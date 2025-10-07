package core_Java.bitManipulation;

public class UpdateBitOperation {
    static int updateIthBit(int n, int i, int newBit) {
        n = ClearBitOperation.clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
