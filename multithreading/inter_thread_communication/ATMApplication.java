package core_Java.multithreading.inter_thread_communication;

class BankAccount {
    private double balance = 0;
    public synchronized void deposit(double amount) throws InterruptedException {
        balance += amount;
        System.out.println(Thread.currentThread().getName() +" deposited "+ amount +", new balance: "+ balance);
        notify();
    }

    public synchronized void withdraw(double amount) throws InterruptedException {
        while (balance < amount) {
            System.out.println(Thread.currentThread().getName() +" waiting to withdraw "+ amount +", current balance: "+ balance);
            wait();
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() +" successfully withdrew "+ amount +", new balance: "+ balance);
    }
}

public class ATMApplication {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        //Depositor thread
        Thread depositor = new Thread(() -> {
            try {
                account.deposit(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }, "Depositor");

        //Withdrawer thread
        Thread withdrawer = new Thread(() -> {
            try {
                account.withdraw(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }, "Withdrawer");

        withdrawer.start();
        depositor.start();
    }
}
