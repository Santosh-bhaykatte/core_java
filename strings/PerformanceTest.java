package core_Java.strings;

public class PerformanceTest {
    public static void main(String[] args) {
        //Using String
        long start1 = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100000; ++i) {
            s += i;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Time with String: "+ (end1-start1) +" ms");

        //Using StringBuilder
        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; ++i) {
            sb.append(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Time with StringBuilder: "+ (end2-start2) +" ms");
    }
}
