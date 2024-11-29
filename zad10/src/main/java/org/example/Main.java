package org.example;

public class Main {
    public static void main(String[] args) {
        BankFacade bank = new BankFacade(1000);

        bank.deposit(500);
        bank.withdraw(300);
        bank.checkBalance();
        bank.withdraw(1500);
    }
}