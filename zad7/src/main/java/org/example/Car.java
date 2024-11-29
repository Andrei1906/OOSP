package org.example;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brand;
    private String model;
    private String color;
    private List<String> options;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
        this.options = builder.options;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", options=" + options +
                '}';
    }

    public static class CarBuilder {
        private String brand;
        private String model;
        private String color;
        private List<String> options = new ArrayList<>();

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder addOption(String option) {
            this.options.add(option);
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
