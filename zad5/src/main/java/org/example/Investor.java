package org.example;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " notified. Stock: " + stockName + ", New Price: " + price);
    }
}