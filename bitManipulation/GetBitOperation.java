/* Get ith bit

We do (num & 1) -> LSB (0th bit)
for ith bit,

num & (1<<i)    -> ith bit

* */

package core_Java.bitManipulation;

public class GetBitOperation {
    static int getIthBit(int num, int i) {
        int bitMask = (1<<i);
        if ((num & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(-10, 2));
    }
}
