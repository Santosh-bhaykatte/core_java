package core_Java.exceptions;

import java.util.Scanner;

//Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class Account {
    private double balance;
    Account(double balance) {   //Initialize balance
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdraw completed!\nbalance: "+ balance);
    }
}

public class CustomException_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(10000.0);
        try {
            System.out.println("Going to withdraw..");
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);      //Throws InsufficientBalanceException
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: "+ e.getMessage());
        }
        System.out.println("Transaction completed!");
    }
}
