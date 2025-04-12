package core_Java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class CharFrequency {
    static void charFrequency(String str) {
        char[] arr = str.toCharArray();

        int[] countFrequency = new int[arr.length];
        char[] visited = new char[arr.length];

        int visitPos = 0, countPos = 0;

        char ch;
        for (int i = 0; i < arr.length; ++i) {
            int count = 1;      // for single occurence of each char
            ch = arr[i];

            if (ch == '0' || ch == ' ' ) continue;      // Skip if already visited or space

            for (int j = i+1; j < arr.length; ++j) {
                if (ch == arr[j]) {
                    ++count;
                    arr[j] = '0';      // Mark as visited
                }
            }
            visited[visitPos++] = ch;
            countFrequency[countPos++] = count;
        }

        System.out.println("Characters frequency::");
        int k = 0;
        while (visited[k] != '\0') {
            System.out.println(visited[k] +" => "+ countFrequency[k]);
            ++k;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        charFrequency(str);
    }
}
