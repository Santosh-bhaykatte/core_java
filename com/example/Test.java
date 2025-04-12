package core_Java.com.example;

public class Test {
    public static void main(String[] args) {
        //default access within same package
        DefaultExample dex = new DefaultExample();
        System.out.println("default variable: "+ dex.defaultVar);
        dex.defaultMethod();
    }
}
