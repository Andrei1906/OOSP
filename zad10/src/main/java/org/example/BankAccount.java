package org.example;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Депозит: " + amount + ", Текущий баланс: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Вывести: " + amount + ", Текущий баланс: " + balance);
        } else {
            System.out.println("Недостаточно средств!");
        }
    }

    public double getBalance() {
        return balance;
    }
}