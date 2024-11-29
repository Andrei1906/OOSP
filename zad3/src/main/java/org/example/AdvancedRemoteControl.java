package org.example;

public class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void control() {
        System.out.print("Усовершенствованное дистанционное управление: ");
        device.performOperation();
    }
}