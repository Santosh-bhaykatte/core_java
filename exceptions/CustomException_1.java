package core_Java.exceptions;

import java.util.Scanner;

//Custom Exception Handling for Invalid Input
class InvalidInputException extends Exception {
    InvalidInputException(String str) {
        super(str);     //call's super class constructor
    }
}

public class CustomException_1 {
    static void validateInput(int num) throws InvalidInputException {
        if (num < 0) {
            throw new InvalidInputException("Input can not be negative.");
        } else {
            System.out.println("valid input: "+ num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            validateInput(num);     //Throws InvalidInputException
        } catch (InvalidInputException e) {
            System.out.println("Exception: "+ e.getMessage());
        }
    }
}
