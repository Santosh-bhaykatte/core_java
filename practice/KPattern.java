package core_Java.practice;

public class KPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; ++i) {
            int m = n-i+1;
            for (int j = 1; j <= m; ++j) {
                if (j == 1 || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i <= n-1; ++i) {
            for (int j = 1; j <= i+1; ++j) {
                if (j == 1 || j == i+1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
