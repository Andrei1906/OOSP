package org.example;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Первое log сообщение.");
        logger2.log("Второе log сообщение.");

        System.out.println("Оба экземпляра одинаковы: " + (logger1 == logger2));
    }
}