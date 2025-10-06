package core_Java.bitManipulation;

public class CheckEvenOdd {
    static String checkEvenOdd(int num) {
        if ((num & 1) == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public static void main(String[] args) {
        System.out.println(checkEvenOdd(89));
    }
}
