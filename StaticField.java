package core_Java;

public class StaticField {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        System.out.println("Total objects created: "+ Counter.count);
    }
}

class Counter {
    static int count = 0;
    Counter() {
        ++count;
    }
}
