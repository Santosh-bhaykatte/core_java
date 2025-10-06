/*
-ve number is 2's complement of +ve number

* To get 2's complement
1. one's complement of +ve num
2. add 1

* */

package core_Java.bitManipulation;

public class Playground {
    public static void main(String[] args) {
        //Bitwise operators
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);      //same bits -> False else True
        System.out.println(~5);
        System.out.println(~-5);
    }
}
