package core_Java.anotherpackage;

public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        AnotherHelper anotherHelper = new AnotherHelper();

        helper.display();
        anotherHelper.print();
    }
    public static class Helper {
        public void display() {
            System.out.println("Helper Class of Main class of anotherpackage");
        }
    }
    public static class AnotherHelper {
        public void print() {
            System.out.println("AnotherHelper Class of Main class of anotherpackage");
        }
    }
}
