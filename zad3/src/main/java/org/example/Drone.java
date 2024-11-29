package org.example;

public class Drone implements Device {
    @Override
    public void performOperation() {
        System.out.println("Дрон выполняет операцию.");
    }
}