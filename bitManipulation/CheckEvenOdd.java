package core_Java.bitManipulation;

public class CheckEvenOdd {
    static String checkEvenOdd(int num) {
        int bitMask = 1;
        if ((num & bitMask) == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public static void main(String[] args) {
        System.out.println(checkEvenOdd(81));
    }
}
