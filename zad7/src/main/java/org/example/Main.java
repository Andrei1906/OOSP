package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setBrand("ВАЗ")
                .setModel("2115")
                .setColor("Black")
                .addOption("Подогрев сидений")
                .build();

        System.out.println(car);
    }
}