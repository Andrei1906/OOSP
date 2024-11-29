package org.example;

public class Main {
    public static void main(String[] args) {
        Device robot = new Robot();
        Device drone = new Drone();
        Device car = new AutonomousCar();

        RemoteControl robotControl = new AdvancedRemoteControl(robot);
        RemoteControl droneControl = new AdvancedRemoteControl(drone);
        RemoteControl carControl = new AdvancedRemoteControl(car);

        robotControl.control();
        droneControl.control();
        carControl.control();
    }
}