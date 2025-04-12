package core_Java.multithreading.sync;

import java.util.AbstractCollection;

class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: "+ amount +", New Balance: "+ balance);
    }
    public synchronized void withdraw(double amount) {
        if (balance <= amount) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: "+ amount +", New Balance: "+ balance);
        }
    }
}

class AccountHolder extends Thread {
    BankAccount bankAccount;
    double amount;
    String action;
    public AccountHolder(BankAccount bankAccount, double amount, String action) {
        this.bankAccount = bankAccount;
        this.amount = amount;
        this.action = action;
    }
    @Override
    public void run() {
        if (action.equalsIgnoreCase("Deposit")) {
            bankAccount.deposit(amount);
        } else {
            bankAccount.withdraw(amount);
        }
    }
}

public class SyncDemo2 {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount(1000);

        AccountHolder accountHolder = new AccountHolder(bankAccount, 500, "deposit");
        accountHolder.start();
        accountHolder.join();

        accountHolder = new AccountHolder(bankAccount, 1000, "withdraw");
        accountHolder.start();
    }
}
