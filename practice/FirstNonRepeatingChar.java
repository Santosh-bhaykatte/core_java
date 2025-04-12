package core_Java.practice;

// First non-repeating character in string
// e.g - swiss  => w
// swiwusi => u

import java.util.Scanner;

public class FirstNonRepeatingChar {
    static void charFrequency(String str) {
        if (str.equals("")) {
            System.out.println("Empty string");
            return;
        }
        char[] arr = str.toCharArray();

        int[] trackCountFrequency = new int[arr.length];    // Track frequency
        char[] visited = new char[arr.length];              // Track visited chars

        boolean[] isVisited = new boolean[arr.length];      // Track visited indices

        int visitPos = 0, countPos = 0;

        for (int i = 0; i < arr.length; ++i) {
            int count = 1;
            char ch = arr[i];

            if (ch == ' ' || isVisited[i]) continue;    // Skip if already visited or space

            for (int j = i+1; j < arr.length; ++j) {
                if (ch == arr[j] && !isVisited[j]) {
                    ++count;
                    isVisited[j] = true;    // Mark as visited
                }
            }
            visited[visitPos++] = ch;
            trackCountFrequency[countPos++] = count;
        }

//        for (int i = 0; i < visitPos; ++i) {
//            System.out.println(visited[i] +" => "+ trackCountFrequency[i]);
//        }

        int min = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < visitPos; ++i) {
            if (trackCountFrequency[i] < min) {
                min = trackCountFrequency[i];
                index = i;
            }
        }
        System.out.println("lowest frequency char: "+ visited[index]);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        charFrequency(str);
    }
}
