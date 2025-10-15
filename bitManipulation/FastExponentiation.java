package core_Java.bitManipulation;

public class FastExponentiation {
    static int fastExpo(int a, int n) {
        int res = 1;
        while (n != 0) {
            if ((n & 1) != 0) {     //LSB
                res = res * a;
            }
            a = a * a;
            n = n>>1;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(fastExpo(2, 5));
    }
}
