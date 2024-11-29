package org.example;

public class Main {
    public static void main(String[] args) {
        Stock apple = new Stock("Яндекс", 150);
        Stock google = new Stock("Google", 2800);

        Observer investor1 = new Investor("Investor 1");
        Observer investor2 = new Investor("Investor 2");

        apple.addObserver(investor1);
        google.addObserver(investor2);

        apple.setPrice(155);
        google.setPrice(2900);
    }
}