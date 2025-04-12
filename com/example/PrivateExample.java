package core_Java.com.example;

//class can not be declared as private (except for nested classes)
public class PrivateExample {
    private int privateVar = 20;
    private void privateMethod() {
        System.out.println("Private method");
    }
    public void privateAccess() {
        System.out.println("private variable: " + privateVar);
        privateMethod();
    }
}
