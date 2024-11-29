package org.example;

public class BankFacade {
    private final BankAccount account;

    public BankFacade(double initialBalance) {
        this.account = new BankAccount(initialBalance);
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void checkBalance() {
        System.out.println("Текущий баланс: " + account.getBalance());
    }
}