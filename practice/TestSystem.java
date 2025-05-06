package core_Java.practice;

import java.io.PrintStream;

class TestSystemClass {
    public static final PrintStream out = new PrintStream(System.out);
}

public class TestSystem {
    public static void main(String[] args) {
        TestSystemClass.out.println("Hello, System");
    }
}
