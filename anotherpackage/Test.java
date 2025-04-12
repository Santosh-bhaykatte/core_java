package core_Java.anotherpackage;

public class Test {
    public static void main(String[] args) {
        Main.Helper helper = new Main.Helper();
        Main.AnotherHelper anotherHelper = new Main.AnotherHelper();

        helper.display();
        anotherHelper.print();
    }
    public static class SubTest {
        public void display() {
            System.out.println("SubTest class of Test class from anotherPackage");
        }
    }
    public static class AnotherSubTest {
        public void display() {
            System.out.println("AnotherSubTest class of Test class from anotherpackage");
        }
    }
}
