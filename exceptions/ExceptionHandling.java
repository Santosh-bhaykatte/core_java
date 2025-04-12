package core_Java.exceptions;

/*
* Exception handling in Java is a mechanism to handle runtime errors gracefully, ensuring that the program does not crash unexpectedly. It allows you to separate error-handling code from regular code, making your programs more robust and maintainable.

* An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions.

Examples:
* Dividing by zero (ArithmeticException).
* Accessing an array index that doesn’t exist (ArrayIndexOutOfBoundsException).
* Trying to open a file that doesn’t exist (FileNotFoundException).

* Types of Exceptions

* Checked Exceptions:
* Checked exceptions are checked at compile time.
* These are exceptions that the compiler forces you to handle (e.g., IOException, SQLException).

You must either:
* Handle them using a try-catch block.
* Declare them using the throws keyword.

*  Unchecked Exceptions:
* Unchecked exceptions are checked at runtime.
* These are exceptions that the compiler does not force you to handle (e.g., NullPointerException, ArithmeticException).
* They are subclasses of RuntimeException.

* Errors
* Errors are serious issues that are not meant to be handled by the application (e.g., OutOfMemoryError, StackOverflowError).
* They are subclasses of Error.

* throw:
The throw keyword is used to explicitly throw an exception.

* throws:
The throws keyword is used in a method signature to declare that the method might throw an exception. Passing responsibility of handling exception to caller


* Hierarchy Diagram:

* Throwable
├── Error
│   ├── OutOfMemoryError
│   ├── StackOverflowError
│   └── ...
└── Exception
    ├── IOException
    │   ├── FileNotFoundException
    │   └── ...
    ├── SQLException
    ├── RuntimeException
    │   ├── NullPointerException
    │   ├── ArithmeticException
    │   └── ...
    └── ...


* */

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* Internal code - working of getMessage()
class Throwable {
    private String message;
    Throwable(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}

class Exception extends Throwable {
    Exception(String message) {
        super(message);
    }
}

 */

//custom exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);     //call's super class constructor
    }
}

public class ExceptionHandling {
    static void validateAnotherAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        } else {
            System.out.println("Age is valid");
        }
    }
    static void readFile(String name) throws FileNotFoundException {
        FileInputStream file = new FileInputStream(name);   //Throws FileNotFoundException
    }
    public static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or older");
        } else {
            System.out.println("Valid age!");
        }
    }
    public static void main(String[] args) {
        try {
            int[] arr = {0, 1, 3};
            System.out.println(arr[5]);     //Throws ArrayIndexOutOfBoundsException
            int result = 10/0;      //Throws ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception: "+ e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: "+ e.getMessage());
        } finally {
            System.out.println("This will always execute.");
        }

        try {
            validateAge(15);    //Throws Exception
        } catch (Exception e) {
            System.out.println("Exception: "+ e.getMessage());
        }

        try {
            readFile("text.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: "+ e.getMessage());
        }

        try {
            validateAnotherAge(13);     //Throws InvalidStudentAgeException
        } catch (InvalidAgeException e) {
            System.out.println("Exeption: "+ e.getMessage());
        }
    }
}
