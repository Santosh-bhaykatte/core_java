package core_Java;

public class StaticMembers {
    public static void main(String []args) {
        System.out.println("Sum: "+ MathUtils.add(10, 5));

        MathUtils utils = new MathUtils();
        //call static method by passing object reference
        MathUtils.display(utils);
    }
}

class MathUtils {
    //static variables -> class variables
    static int x = 10;
    static int y = 5;

    //non-static field -> instance variable
    int z;

    //static methods
    static int product() {
        return x*y;
    }
    static int add(int a, int b) {
        System.out.println("Product: "+ product());
        return a+b;
    }

    static void display(MathUtils ob) {
        System.out.println("Z: "+ ob.z);    //access non-static var using instance of class
        ob.printZ();    //call non-static method using instance of class
    }

    //non-static method
    void printZ() {
        System.out.println("Z: "+ z);
        System.out.println("Sum: "+ (x+y));     //access static variables directly
    }


}
