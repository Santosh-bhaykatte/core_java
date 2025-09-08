package core_Java.multithreading.sync;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: "+ amount +", Balance: "+ balance);
    }

    public synchronized void withdraw(double amount) {
        if (amount >= balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: "+ amount +", Balance: "+ balance);
        }
    }
}

class AccountHolder extends Thread {
    private BankAccount account;    //Aggregation
    private double amount;
    private String action;

    public AccountHolder(BankAccount account, double amount, String action) {
        this.account = account;
        this.amount = amount;
        this.action = action;
    }

    @Override
    public void run() {
        if (action.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}

public class BankApplication {
    public static void main(String[] args) throws InterruptedException {
        //Create BankAccount instance
        BankAccount bankAccount = new BankAccount(1000);

        AccountHolder accountHolder = new AccountHolder(bankAccount, 500, "Deposit");
        accountHolder.start();

        accountHolder.join();

        accountHolder = new AccountHolder(bankAccount, 1000, "Withdraw");
        accountHolder.start();

        accountHolder.join();
        System.out.println("Transaction Completed");
    }
}
