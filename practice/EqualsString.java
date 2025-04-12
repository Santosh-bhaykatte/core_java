package core_Java.practice;

public class EqualsString {
    public static void main(String[] args) {
        String s1 = new String("Mayur");
        String s2 = new String("Mayur");

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        if (arr1.length == 0 || arr2.length == 0 || arr1.length != arr2.length) {
            System.out.println("Not equal");
            return;
        } else {
            boolean isTure = false;
            for (int i = 0; i < arr1.length; ++i) {
                if (arr1[i] == arr2[i]) {
                    isTure = true;
                    continue;
                }
            }
            if (isTure) {
                System.out.println("Equal");
            } else {
                System.out.println("Not equal");
            }
            return;
        }
    }
}
