package core_Java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        /*
        StringBuilder sb = new StringBuilder("");
        for (int i = str.length()-1; i >= 0; --i) {
            sb.append(str.charAt(i));
        }
        if (str.equals(sb.toString())) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

         */

        /*
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        if (str.equals(sb.toString())) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

         */

        /*
        if (str.equals(new StringBuilder(str).reverse().toString())) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

         */

        // Compact code
        boolean result = str.equals(new StringBuilder(str).reverse().toString()) ? true : false;
        System.out.println(result);
    }
}
