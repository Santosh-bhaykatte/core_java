package core_Java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramEx {
    static void checkAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int n = arr1.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n-i-1; ++j) {
                if (arr1[j+1] < arr1[j]) {
                    char temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }

        n = arr2.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n-i-1; ++j) {
                if (arr2[j+1] < arr2[j]) {
                    char temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }
        }

        if (Arrays.toString(arr1).equals(Arrays.toString(arr2))) {
            System.out.println("anagram");
        } else {
            System.out.println("not anagram");
        }

        /*
        if (Arrays.toString(arr1).equals(Arrays.toString(arr2))) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
         */
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = sc.nextLine();

        checkAnagram(str1, str2);
    }
}
