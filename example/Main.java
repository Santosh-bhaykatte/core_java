// package declaration
package core_Java.example;

// import classes
import core_Java.example.utils.Helper;
import core_Java.example.utils.AnotherHelper;
import core_Java.anotherpackage.Demo;
import core_Java.anotherpackage.Test;

public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();
        AnotherHelper anotherHelper = new AnotherHelper();

        //object of Test class
        Test test = new Test();

        //object of subclass of Test class
        Test.SubTest subTest = new Test.SubTest();
        Test.AnotherSubTest anotherSubTest = new Test.AnotherSubTest();

        helper.display();
        anotherHelper.print();
        Demo.print();
        Test.main(null);
        subTest.display();
        anotherSubTest.display();
    }
}
