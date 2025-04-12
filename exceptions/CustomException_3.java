package core_Java.exceptions;

import java.util.Scanner;

class InvalidEmailException extends Exception {
    InvalidEmailException(String message) {
        super(message);     //call's super class constructor
    }
}

class Email {
    public void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Invalid email!");
        }
        System.out.println("valid email: "+ email);
    }
}

public class CustomException_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Email ac = new Email();
        try {
            System.out.print("Enter email: ");
            String email = sc.nextLine();
            ac.validateEmail(email);        //Throws InvalidEmailException
        } catch (InvalidEmailException e) {
            System.out.println("Exception: "+ e.getMessage());
        }
    }
}
