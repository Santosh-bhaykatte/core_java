package core_Java.strings;

/*  StringBuilder:
* Mutable: The content of a StringBuilder can be changed after it is created.
* Not Thread-Safe: StringBuilder is not synchronized, meaning it is not safe for use in multi-threaded environments.
* Performance: It is faster than StringBuffer because it does not have the overhead of synchronization.

* StringBuffer:
* Mutable: Like StringBuilder, the content of a StringBuffer can be changed after it is created.
* Thread-Safe: StringBuffer is synchronized, meaning it is safe for use in multi-threaded environments
* Performance: It is slower than StringBuilder due to the overhead of synchronization.

* */

// use toString() method to convert StringBuilder, StringBuffer to String

/*
* When to Use StringBuilder vs. StringBuffer

Use StringBuilder:
* When working in a single-threaded environment.
* When performance is critical (e.g., frequent string manipulations in loops).

Use StringBuffer:
* When working in a multi-threaded environment.
* When thread safety is required.

* */

/*
1. why convert mutable strings to immutable (using toString())
   - For immutability & thread safety
    If you need an immutable copy of your StringBuilder content, converting it to String ensures the content won’t be modified later.

   - When using equals() for comparison
    StringBuilder does not override equals(), so direct comparison won't work.

   - If a method requires a String type explicitly
    Many APIs (e.g., file handling, networking) expect a String and won't accept StringBuilder.
 */

class MyThread extends Thread {
    StringBuffer stringBuffer;
    MyThread(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; ++i) {
            stringBuffer.append(i).append(" ");
        }
    }
}

public class MutableStringPlayground {
    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb = new StringBuilder("Hello");
        //Methods
        sb.append(" World");
        sb.insert(5, ',');
        sb.delete(5, 6);
        sb.reverse();

        String result = sb.toString();
        System.out.println(result);

        StringBuilder sbl = new StringBuilder();
        for (int i = 0; i < 5; ++i) {
            sbl.append(i).append(" ");
        }
//        System.out.println(sbl.toString());

        StringBuffer stringBuffer = new StringBuffer();

        MyThread thread1 = new MyThread(stringBuffer);
        MyThread thread2 = new MyThread(stringBuffer);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(stringBuffer.toString());
    }
}
